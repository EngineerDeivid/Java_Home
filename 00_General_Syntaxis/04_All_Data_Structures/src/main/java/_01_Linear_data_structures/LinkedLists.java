package _01_Linear_data_structures;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {

    public static LinkedList<String> datas = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menu de LinkedList ---");
            System.out.println("1. Agregar un elemento al inicio");
            System.out.println("2. Agregar un elemento al final");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Buscar un elemento");
            System.out.println("5. Eliminar el primer elemento");
            System.out.println("6. Eliminar el último elemento");
            System.out.println("7. Eliminar un elemento específico");
            System.out.println("8. Agregar varios items a la lista.");
            System.out.println("9. Salir");
            System.out.print("Seleccione una Opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> agregarAlInicio(scanner);
                case 2 -> agregarAlFinal(scanner);
                case 3 -> mostrarLista();
                case 4 -> buscarElemento(scanner);
                case 5 -> eliminarPrimero();
                case 6 -> eliminarUltimo();
                case 7 -> eliminarEspecifico(scanner);
                case 8 -> agregarItems(scanner);
                case 9 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion inválida. Intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    public static void agregarAlInicio(Scanner scanner) {
        System.out.print("Ingrese el elemento a agregar al inicio: ");
        String item = scanner.nextLine();
        datas.addFirst(item);
        System.out.println("Elemento agregado al inicio.");
    }

    public static void agregarAlFinal(Scanner scanner) {
        System.out.print("Ingrese el elemento a agregar al final: ");
        String item = scanner.nextLine();
        datas.addLast(item);
        System.out.println("Elemento agregado al final.");
    }

    public static void mostrarLista() {
        if (datas.isEmpty()) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("Lista de elementos:");
            for (String eachData : datas) {
                System.out.println("- " + eachData);
            }
        }
    }

    public static void buscarElemento(Scanner scanner) {
    System.out.print("Ingrese el elemento a buscar: ");
    String buscarItem = scanner.nextLine();

    if (datas.contains(buscarItem)) {
        int indice = datas.indexOf(buscarItem);
        System.out.println("Elemento encontrado: \"" + buscarItem + "\" en la posicion " + indice);

        boolean salirSubmenu = false;
        do {
            System.out.println("\n¿Desea que \"" + buscarItem + "\" sea editado?");
            System.out.println("[1] Editar");
            System.out.println("[2] No, volver al inicio");
            System.out.print("Seleccione una opción: ");
            int opcionSubMenu = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcionSubMenu) {
                case 1 -> {
                    System.out.print("Ingrese el nuevo valor para \"" + buscarItem + "\": ");
                    String nuevoValor = scanner.nextLine();
                    datas.set(indice, nuevoValor);
                    System.out.println("Elemento editado con exito. Nuevo valor: \"" + nuevoValor + "\"");
                    salirSubmenu = true; // Salir del submenú después de editar
                }
                case 2 -> {
                    System.out.println("Regresando al menú principal...");
                    salirSubmenu = true; // Salir del submenú
                }
                default -> System.out.println("Opcion invalida. Intente de nuevo.");
            }
        } while (!salirSubmenu);

    } else {
        System.out.println("Elemento \"" + buscarItem + "\" no encontrado.");
    }
}


    public static void eliminarPrimero() {
        if (!datas.isEmpty()) {
            String eliminado = datas.removeFirst();
            System.out.println("Primer elemento eliminado: \"" + eliminado + "\"");
        } else {
            System.out.println("La lista está vacia. No se puede eliminar.");
        }
    }

    public static void eliminarUltimo() {
        if (!datas.isEmpty()) {
            String eliminado = datas.removeLast();
            System.out.println("Ultimo elemento eliminado: \"" + eliminado + "\"");
        } else {
            System.out.println("La lista esta vacia. No se puede eliminar.");
        }
    }

    public static void eliminarEspecifico(Scanner scanner) {
        System.out.print("Ingrese el elemento a eliminar: ");
        String eliminarItemInput = scanner.nextLine();

        if (datas.contains(eliminarItemInput)) {
            datas.remove(eliminarItemInput);
            System.out.println("Elemento \"" + eliminarItemInput + "\" eliminado.");
        } else {
            System.out.println("Elemento \"" + eliminarItemInput + "\" no encontrado.");
        }
    }
    
    public static void agregarItems(Scanner scanner) {
        datas.add("Laptop Dell XPS 13");
        datas.add("Smartphone Samsung Galaxy S21");
        datas.add("Cafetera Nespresso");
        datas.add("Bicicleta de Montaña Trek");
        datas.add("Televisor LG OLED 55'");
        datas.add("Audífonos Sony WH-1000XM4");
        datas.add("Tablet Apple iPad Pro");
        datas.add("Cámara Canon EOS R5");
        datas.add("Monitor Gaming ASUS ROG");
        datas.add("Teclado Mecánico Logitech");
        datas.add("Reloj Inteligente Fitbit Sense");
        datas.add("Consola PlayStation 5");
        datas.add("Cargador Portátil Anker");
        datas.add("Altavoz Bluetooth JBL Charge 5");
        datas.add("Disco Duro Externo Seagate 2TB");

        System.out.println("15 elementos reales han sido agregados a la lista.");
    }

}


/*
LinkedList:

Ideal for storing incomplete or changing information where you need to frequently add, remove, or modify items, 
especially at the beginning or middle of the list.

It handles dynamic sizes more efficiently than ArrayList.

Example use case: Shopping cart where users frequently add or remove items, and you don't know how many items they'll have.

Common Methods:

addFirst(): Add an element to the start.
addLast(): Add an element to the end.
removeFirst(): Remove the first element.
removeLast(): Remove the last element.
getFirst(): Access the first element.
getLast(): Access the last element.
set(): is for edit the data
*/
