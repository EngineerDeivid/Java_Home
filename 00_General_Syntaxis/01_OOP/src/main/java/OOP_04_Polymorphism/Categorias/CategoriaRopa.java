/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_04_Polymorphism.Categorias;

/**
 *
 * @author Laptop
 */
public class CategoriaRopa implements Categorias {
     @Override 
    public double ObtenerValorCategoria () {
        return 4000.0;
    }

    @Override
    public String OntenerNombreCategoria() {
        return "ROPA";
    }
}
