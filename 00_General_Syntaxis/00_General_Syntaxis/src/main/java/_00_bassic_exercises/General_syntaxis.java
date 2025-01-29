package _00_bassic_exercises;
import java.util.Scanner;

public class General_syntaxis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcionUsuario;

        do {
            // Mostrar el menú
            System.out.println("[1]. Llenar formulario.");
            System.out.println("[2]. Salir.");
            System.out.println("\nElija una opción válida!\n");

            // Leer la opción del usuario
            opcionUsuario = input.nextInt();

            // Evaluar la opción con switch
            switch (opcionUsuario) {
                case 1:
                    formulario(); // Llamar al formulario
                    break; // Salir del caso
                case 2:
                    salir(); // Llamar al método salir
                    break; // Salir del caso
                default:
                    System.out.println("Opción inválida. Intente de nuevo.\n");
            }
        } while (opcionUsuario != 2); // Repetir mientras no elija salir
    }

    // Método estático para formulario
    public static void formulario() {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Bienvenidos!!!\n");
        
        System.out.println("Ingrese sus nombres:");
        nombre = input.nextLine();

        System.out.println("Ingrese su edad:");
        edad = input.nextInt();

        System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);

        if (edad < 18) {
            System.out.println("No puede votar.\n");
        } else {
            System.out.println("Usted puede votar.\n");
        }
    }

    // Método estático para salir
    public static void salir() {
        System.out.println("Saliendo del programa...");
        System.exit(0); // Termina el programa con el código de estado 0 (sin errores)
    }
}

// metodos STATICS dependen de las clases, mientras los metodos VOID son totalmente independientes