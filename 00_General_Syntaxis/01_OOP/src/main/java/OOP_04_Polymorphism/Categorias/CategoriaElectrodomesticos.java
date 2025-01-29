/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_04_Polymorphism.Categorias;

public class CategoriaElectrodomesticos implements Categorias {
     @Override 
    public double ObtenerValorCategoria () {
        return 30000.0;
    }

    @Override
    public String OntenerNombreCategoria() {
        return "ELECTRODOMESTICOS";
    }
}
