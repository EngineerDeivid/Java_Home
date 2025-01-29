package OOP_01_class_and_objects;

import java.util.ArrayList;
import java.util.List;

public class consultoriaEmpleados {

    public static void main(String[] args) {
        // Crear una lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        
        // Agregar varios empleados a la lista
        empleados.add(new Empleado("Jose Gonzalez", 4500f));
        empleados.add(new Empleado("Maria Perez", 2800f));
        empleados.add(new Empleado("Carlos Ruiz", 3200f));
        empleados.add(new Empleado("Ana Lopez", 1500f));
        empleados.add(new Empleado("Luis Martinez", 4000f));
        empleados.add(new Empleado("Laura Fernandez", 2200f));
        empleados.add(new Empleado("Andres Lozano", 3000f));
        
        
        System.out.println("LISTA DE EMPLEADOS: \n");
        int i = 0;
        System.out.println("Lista de empleados:");
        for (Empleado cadaEmpleado : empleados) {
            i += 1;
            System.out.println(i + ". " + cadaEmpleado.mostrarInformacion());
            }

        // Filtrar empleados que deben pagar impuestos y mostrar su información
        System.out.println("\nLISTA DE EMPLEADOS QUE DEBEN DE PAGAR IMPUESTOS!\n");
        
        empleados.stream()
                 .filter(empleado -> empleado.getSueldo() >= 3000)
                 .forEach(Empleado::consultarImpuestos); // Llamada a consultarImpuestos() usando método de referencia
    }
}
