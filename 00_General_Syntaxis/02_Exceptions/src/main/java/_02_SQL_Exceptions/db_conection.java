package _02_SQL_Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class db_conection {
    private static final String URL = "jdbc:mysql://localhost:3306/logigo_app"; // URL de la base de datos
    private static final String USER = "root"; // Usuario de la base de datos
    private static final String PASSWORD = "12345"; // Contraseña de la base de datos

    // Método para obtener la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer y devolver la conexión
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // Si no se encuentra el driver, lanzar una excepción
            throw new SQLException("Driver de MySQL no encontrado!", e);
        } catch (SQLException e) {
            // Capturar y lanzar cualquier excepción de SQL
            throw new SQLException("Error al intentar conectarse a la base de datos.", e);
        }
    }
}
