package _02_SQL_Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el objeto LoginService
        Login loginService = new Login();
        
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        int intentos = 0;
        final int MAX_INTENTOS = 3;
        
        while (intentos < MAX_INTENTOS) {
            // Pedimos el nombre de usuario y la contraseña 
            System.out.print("Ingrese el correo electrónico: "); 
            String username = scanner.nextLine(); 
            
            System.out.print("Ingrese la contraseña: "); 
            String password = scanner.nextLine(); 
            
            // Validamos el login
            if (loginService.validateLogin(username, password)) {
                System.out.println("¡Login exitoso!"); 
                break; // Salimos del ciclo si el login es exitoso
            } else { 
                System.out.println("Correo electrónico o contraseña incorrectos."); 
                intentos++; // Incrementamos el contador de intentos fallidos
            } 
            
            // Verificamos si se han agotado los intentos
            if (intentos == MAX_INTENTOS) { 
                System.out.println("Ha superado el número máximo de intentos. El programa se cerrará."); 
            }
        }
        
        // Cerramos el scanner
        scanner.close();
    }
}
