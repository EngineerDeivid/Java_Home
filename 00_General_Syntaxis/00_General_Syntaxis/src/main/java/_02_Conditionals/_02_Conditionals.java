package _02_Conditionals;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class _02_Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<String, Queue<Double>> notasPorEstudiante = new TreeMap<>();

        System.out.println("Sistema de notas de la escuela!\n");
        
        // Registrar datos de estudiantes
        System.out.println("¿Cuántos estudiantes desea registrar?");
        int cantidadEstudiantes = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nombreEstudiante = input.nextLine();

            Queue<Double> notas = new LinkedList<>();

            System.out.println("Ingrese 6 notas para " + nombreEstudiante + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                double nota = input.nextDouble();
                notas.add(nota);
            }
            input.nextLine(); // Consumir el salto de línea

            // Almacenar en el TreeMap
            notasPorEstudiante.put(nombreEstudiante, notas);
        }

        // Mostrar datos y resultados
        System.out.println("\nDatos registrados:");
        for (Map.Entry <String, Queue<Double>> entry : notasPorEstudiante.entrySet()) {
            String nombre = entry.getKey(); // captura los nombres
            Queue<Double> notas = entry.getValue(); // captura las notas
            System.out.println("\nEstudiante: " + nombre);
            System.out.println("Notas: " + notas);

            // Evaluar el promedio y resultado
            double promedio = calcularPromedio(notas); // llama a notas = entry.getValue(),
            String resultado = evaluarNotas(promedio);
            System.out.println("Promedio: " + promedio);
            System.out.println("Resultado: " + resultado);
        }

        input.close(); // Cerrar el recurso Scanner
    }

    // Método para calcular el promedio de una Queue de notas
    public static double calcularPromedio(Queue<Double> notas) {
        double suma = 0;
        for (double nota : notas) { 
            suma += nota; // se suman todas las notas de la lista....
        }
        return suma / notas.size(); // el total de notas se divide por el numero de notas, dando la nota final.
    }

    // Método para evaluar el promedio
    public static String evaluarNotas(double promedio) {
        if (promedio < 70) {
            return "Reprobado";
        } else if (promedio >= 70 && promedio < 90) {
            return "Aprobado";
        } else if (promedio >= 90) {
            return "Sobresaliente";
        } else {
            return "Nota inválida";
        }
    }
}
