/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_04_Polymorphism.Categorias;

public class CategoriaConstruccion implements Categorias {
     @Override 
    public double ObtenerValorCategoria () {
        return 15000.0;
    }

    @Override
    public String OntenerNombreCategoria() {
        return "CONSTRUCCION";
    }
}
