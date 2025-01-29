/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_01_class_and_objects;

public class Empleado {
    public String nombre;
    private Float sueldo;
    
    public Empleado (String nombre, Float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String mostrarInformacion() {
        return "Nombre: " + nombre + ", Sueldo: " + sueldo;
    }
    
    public void consultarImpuestos() {
        if (this.sueldo >= 3000.00) {
            System.out.println("Querido "+this.nombre+" usted debe de pagar impuestos!");
        } else {
            if (this.sueldo < 3000.00) {
                System.out.println("Querido "+this.nombre+" usted no debe de pagar impuestos!");
            } else {
                System.out.println("ERROR!!");
            }
        }
    }
    
    // Método getter para sueldo
    public Float getSueldo() {
        return sueldo;
    }
}
