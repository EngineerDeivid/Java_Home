/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP_03_Inherence_1;
import java.util.Deque;
import java.util.LinkedList;
public class MainMenu {

    public static void main(String[] args) {
        // Crear roles
        RoleClass adminRole = new Admin("Admin", 5000f);
        RoleClass conductorRole = new conductor("Conductor", 4000f);
        RoleClass bodegaRole = new AuxBodega("Auxiliar Bodega", 3000f);
        
        
        // Crear una lista para almacenar los empleados
        Deque<UserMain> empleados = new LinkedList<>();
        
        // Crear empleados con sus roles y agregar a la lista
        UserMain emp1 = new UserMain("Jose Gonzalez", "30", "Av. Principal 123", "Oficina", "2023-01-10", adminRole);
        UserMain emp2 = new UserMain("Maria Perez", "28", "Calle 45", "Bodega", "2022-07-15", bodegaRole);
        UserMain emp3 = new UserMain("Carlos Ruiz", "35", "Calle del Sol 78", "Transporte", "2021-05-21", conductorRole);
        
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        
        // Mostrar información de los empleados en la lista
        for (UserMain empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println("-----------------------------------");
        }
    }
    
}


