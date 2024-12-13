package repositories;

import models.Platos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlatosRepositoryJdbcImplement implements Repository<Platos>{
    /* Necesitamos una conexion a la base de datos , la conexxión se tiene que pasar al repository, luego
     * se lo pasa al Service y a su veez el servlet lo obtiene del objeto request de los atributos
     * que se setearon por request vuelve a oasar al seervice y el service pasa al repository*/
    private Connection conn;
    // implementamos un contructor para inicializar a la Conexion
    public PlatosRepositoryJdbcImplement(Connection conn) {
        this.conn = conn;
    }
    //Sobreescribimos alos metodos de la clase interfaz
    //Inicion de funcion para listar platos
    @Override
    public List<Platos> listar() throws SQLException {
        //declaro una variable que me ba ha contener el query de la bbdd gestion // platos
        String SQL="SELECT * FROM plato";
        //INICIALIZO PLATOS = DATOS DE MODELO
        List<Platos> platos = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
                Platos plato = new Platos();
                plato.setIdplato(rs.getInt("idplato"));
                plato.setNombre(rs.getString("nombre"));
                plato.setDescripcion(rs.getString("descripcion"));
                plato.setCategoria(rs.getString("categoria"));
                plato.setPrecio(rs.getDouble("precio"));
                plato.setStock(rs.getInt("stock"));
                plato.setEstado(rs.getInt("estado"));
                platos.add(plato);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return platos;
    }

    @Override
    public Platos porId(Long id) throws SQLException {
        return null;
    }

    @Override
    public void guardar(Platos platos) throws SQLException {

    }

    @Override
    public void eliminar(Long id) throws SQLException {

    }
}
