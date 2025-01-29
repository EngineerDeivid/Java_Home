package _02_Conditionals;
import java.util.*;

public class _03_conditionals {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int opcionUser;

        do {
            System.out.println("[1]. Crear empleado.\n"
                    + "[2]. Ver lista de empleados.\n"
                    + "[3]. Salir\n");
            opcionUser = inputScanner.nextInt();

            switch (opcionUser) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    verListaEmpleados();
                    break;
                case 3:
                    FinPrograma(); // Ahora funcionará correctamente
                    break;
                default:
                    System.out.println("Opción inválida!!!\n");
            }
        } while (opcionUser != 3); // El programa se repite hasta que elijas salir
    }

    public static void crearEmpleado() {
        Scanner inputScanner = new Scanner(System.in);
        String nombre;
        int anosExp;
        double salario;

        System.out.println("\nIngrese nombre del Empleado:");
        nombre = inputScanner.nextLine();

        System.out.println("\nIngrese el salario del Empleado:");
        salario = inputScanner.nextDouble();

        System.out.println("\nIngrese los años de experiencia del Empleado:");
        anosExp = inputScanner.nextInt();

        if (anosExp >= 5 && salario < 10000d) {
            System.out.println("Este empleado necesita un mejor salario, $10000 o más!\n");
        } else if (anosExp <= 4 && salario <= 5000d) {
            System.out.println("Este empleado necesita un mejor salario, $5000 o más!\n");
        } else if (anosExp <= 3 && salario <= 2500d) {
            System.out.println("Este empleado necesita un mejor salario, $2500 o más!\n");
        } else if (anosExp <= 2 && salario <= 1500d) {
            System.out.println("Este empleado necesita un mejor salario, $1500 o más!\n");
        } else if (anosExp <= 1 && salario <= 1000d) {
            System.out.println("Este empleado necesita un mejor salario, $1000 o más!\n");
        } else {
            System.out.println("El salario del empleado parece adecuado.\n");
        }
    }

    public static void verListaEmpleados() {
        // Aquí puedes añadir lógica para mostrar una lista de empleados si decides implementarla.
        System.out.println("Función no implementada aún.");
    }

    public static void FinPrograma() {
        System.out.println("Saliendo del programa...");
        // El ciclo `do-while` en main manejará el cierre natural del programa.
    }
}
