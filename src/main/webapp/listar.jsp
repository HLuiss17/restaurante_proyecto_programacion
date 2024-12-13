<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*, models.*" %>
<%
    List<Platos> platos = (List<Platos>) request.getAttribute("platos");
%>
<html>
<head>
    <title>Lista de Platos</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            text-align: left;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<h1>Lista de Platos</h1>

<table>
    <thead>
    <tr>
        <th>ID PLATO</th>
        <th>NOMBRE</th>
        <th>DESCRIPCIÓN</th>
        <th>CATEGORÍA</th>
        <th>PRECIO</th>
        <th>STOCK</th>
        <th>ESTADO</th>
        <th>OPCIONES</th>
    </tr>
    </thead>
    <tbody>
    <% if (platos != null) {
        for (Platos p : platos) { %>
    <tr>
        <td><%= p.getIdplato() %></td>
        <td><%= p.getNombre() %></td>
        <td><%= p.getDescripcion() %></td>
        <td><%= p.getCategoria() %></td>
        <td><%= p.getPrecio() %></td>
        <td><%= p.getStock() %></td>
        <td><%= p.getEstado() %></td>
        <td>
            <%--- <a href="editarPlato?id=<%= p.getId() %>">Editar</a> |
            <a href="eliminarPlato?id=<%= p.getId() %>" onclick="return confirm('¿Estás seguro de eliminar este plato?');">Eliminar</a>--%>

        </td>
    </tr>
    <% }
    } else { %>
    <tr>
        <td colspan="8">No hay platos disponibles.</td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
