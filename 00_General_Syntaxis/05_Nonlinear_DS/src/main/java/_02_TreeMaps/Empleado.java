/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_TreeMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class Empleado implements Comparable<Empleado> {
    private int id;
    private String nombreCompleto;
    private int edad;
    private double salario;

    // Atributos estáticos para manejar el TreeMap y TreeSet
    private static TreeMap<Integer, Empleado> empleados = new TreeMap<>();
    private static TreeSet<Integer> ids = new TreeSet<>();

    // Constructor
    public Empleado(int id, String nombreCompleto, int edad, double salario) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescribir toString para mostrar la información del empleado
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombreCompleto + ", Edad: " + edad + ", Salario: " + salario;
    }

    // Implementación de Comparable (para ordenar empleados, si es necesario)
    @Override
    public int compareTo(Empleado otro) {
        return this.id - otro.id; // Comparar por ID
    }

    // Métodos estáticos para manejar el TreeMap
    public static void agregarEmpleado(int id, String nombre, int edad, double salario) {
        if (ids.contains(id)) {
            System.out.println("Error: El ID ya existe. No se puede agregar el empleado.");
            return;
        }
        Empleado nuevoEmpleado = new Empleado(id, nombre, edad, salario);
        empleados.put(id, nuevoEmpleado);
        ids.add(id);
        System.out.println("Empleado agregado exitosamente.");
    }

    public static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        System.out.println("\nLista de Empleados:");
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void editarEmpleado(int id, String nuevoNombre, int nuevaEdad, double nuevoSalario) {
        if (!empleados.containsKey(id)) {
            System.out.println("Error: No existe un empleado con ese ID.");
            return;
        }
        Empleado empleado = empleados.get(id);
        empleado.setNombreCompleto(nuevoNombre);
        empleado.setEdad(nuevaEdad);
        empleado.setSalario(nuevoSalario);
        System.out.println("Empleado actualizado exitosamente.");
    }

    public static void eliminarEmpleado(int id) {
        if (!empleados.containsKey(id)) {
            System.out.println("Error: No existe un empleado con ese ID.");
            return;
        }
        empleados.remove(id);
        ids.remove(id);
        System.out.println("Empleado eliminado exitosamente.");
    }
}
