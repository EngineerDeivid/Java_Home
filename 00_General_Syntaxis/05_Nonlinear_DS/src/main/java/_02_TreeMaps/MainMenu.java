    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _02_TreeMaps;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleados");
            System.out.println("3. Editar Empleado");
            System.out.println("4. Eliminar Empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese Nombre Completo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese Salario: ");
                    double salario = scanner.nextDouble();

                    Empleado.agregarEmpleado(id, nombre, edad, salario);
                }
                case 2 -> Empleado.mostrarEmpleados();
                
                case 3 -> {
                    System.out.print("Ingrese ID del empleado a editar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese Nuevo Nombre Completo: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese Nueva Edad: ");
                    int nuevaEdad = scanner.nextInt();
                    System.out.print("Ingrese Nuevo Salario: ");
                    double nuevoSalario = scanner.nextDouble();

                    Empleado.editarEmpleado(id, nuevoNombre, nuevaEdad, nuevoSalario);
                }
                case 4 -> {
                    System.out.print("Ingrese ID del empleado a eliminar: ");
                    int id = scanner.nextInt();
                    Empleado.eliminarEmpleado(id);
                }
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
}