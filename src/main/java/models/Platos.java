package models;

public class Platos {

    private static int idplato;
    private static String nombre;
    private static String descripcion;
    private static String categoria;
    private static double precio;
    private static int stock;
    private static int estado;

    public Platos() {
    }

    public Platos(int idplato, String nombre, String descripcion, String categoria, double precio, int stoc, int estado) {

        this.idplato=idplato;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.precio=precio;
        this.stock=stock;
        this.estado=estado;
    }

    public static int getIdplato() {
        return idplato;
    }

    public static void setIdplato(int idplato) {
        Platos.idplato = idplato;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Platos.nombre = nombre;
    }

    public static String getDescripcion() {
        return descripcion;
    }

    public static void setDescripcion(String descripcion) {
        Platos.descripcion = descripcion;
    }

    public static String getCategoria() {
        return categoria;
    }

    public static void setCategoria(String categoria) {
        Platos.categoria = categoria;
    }

    public static double getPrecio() {
        return precio;
    }

    public static void setPrecio(double precio) {
        Platos.precio = precio;
    }

    public static int getStock() {
        return stock;
    }

    public static void setStock(int stock) {
        Platos.stock = stock;
    }

    public static int getEstado() {
        return estado;
    }

    public static void setEstado(int estado) {
        Platos.estado = estado;
    }
}


