package _02_SQL_Exceptions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    // Método que valida si el usuario y la contraseña son correctos
    public boolean validateLogin(String username, String password) {
        boolean isValid = false;

        // Definimos la consulta SQL
        String query = "SELECT * FROM usuarios WHERE emailUsuario = ? AND contrasenaUsuario = ?";

        try (Connection conn = db_conection.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(query)) {
            
            // Establecemos los parámetros de la consulta
            stmt.setString(1, username);
            stmt.setString(2, password);

            // Ejecutamos la consulta
            ResultSet rs = stmt.executeQuery();

            // Si encontramos un registro que coincida, el login es válido
            if (rs.next()) {
                isValid = true;
            }
        } catch (SQLException e) {
            System.err.println("Error al validar el login: " + e.getMessage());
        }

        return isValid;
    }
}
