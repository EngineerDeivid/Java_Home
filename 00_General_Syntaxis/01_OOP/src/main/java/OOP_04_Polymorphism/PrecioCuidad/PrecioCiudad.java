/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package OOP_04_Polymorphism.PrecioCuidad;

import OOP_04_Polymorphism.Categorias.Categorias;



public interface PrecioCiudad extends Categorias {
   double obtenerPrecioCiudad();  // Método para obtener el precio de la ciudad
   double calcularPrecioTotal(Categorias categoria);  // Método para calcular el precio total , llamada a la interfaz general Categorias
   String obteberCuidad();
}
