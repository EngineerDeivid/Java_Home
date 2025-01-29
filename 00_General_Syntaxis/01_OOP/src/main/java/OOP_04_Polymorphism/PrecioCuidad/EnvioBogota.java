/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_04_Polymorphism.PrecioCuidad;

// Importar correctamente la interfaz Categoria
import OOP_04_Polymorphism.Categorias.Categorias;

public class EnvioBogota implements PrecioCiudad {

    @Override
    public double obtenerPrecioCiudad() {
        return 10000; // Factor multiplicador de Cartagena
    }

    @Override
    public double calcularPrecioTotal(Categorias categoria) {
        return categoria.ObtenerValorCategoria() * obtenerPrecioCiudad();
    }
    
    
    @Override
    public String obteberCuidad() {
        return "BOGOTA";
    }

    @Override
    public double ObtenerValorCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String OntenerNombreCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}