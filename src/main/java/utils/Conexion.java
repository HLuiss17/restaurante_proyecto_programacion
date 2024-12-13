package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Conexion {
  // URL AL BBDD
    private static final String  URL = "jdbc:mysql://localhost:3306/gestion?useTimezone=true&serverTimezone=UTC";
    private static final String  USERAME = "root";
    private static final String  PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERAME,PASSWORD);
    }


}
