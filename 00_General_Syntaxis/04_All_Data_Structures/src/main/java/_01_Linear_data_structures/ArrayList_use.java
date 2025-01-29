package _01_Linear_data_structures;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_use {

    public static ArrayList<String> ListaGeneral = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Here is some examples of how to use ArrayList and their methods");

        // Ejemplo interactivo
        crearElemento("Primero");
        crearElemento("Segundo");
        crearElemento("Aqui hay muchos elementos");

        verElementos();

        buscarItem();
    }

    // Método para agregar un nuevo elemento a la lista
    public static void crearElemento(String nuevoElemento) {
        ListaGeneral.add(nuevoElemento);
        System.out.println("Elemento agregado: " + nuevoElemento);
    }

    // Método para mostrar los elementos de la lista
    public static void verElementos() {
        if (ListaGeneral.isEmpty()) {
            System.out.println("The ArrayList is Empty!\nPlease add new items!");
        } else {
            System.out.println("Elementos en la lista:");
            for (int i = 0; i < ListaGeneral.size(); i++) {
                System.out.println((i + 1) + ". " + ListaGeneral.get(i));
            }
        }
    }

    // Método para buscar un elemento en la lista (usando Scanner)
    public static void buscarItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el elemento que desea buscar: ");
        String buscarItem = scanner.nextLine();

        if (ListaGeneral.contains(buscarItem)) {
            int indice = ListaGeneral.indexOf(buscarItem);
            System.out.println("Elemento encontrado: \"" + buscarItem + "\" en la posición " + indice);
        } else {
            System.out.println("Elemento \"" + buscarItem + "\" no encontrado en la lista.");
        }
    }
}
