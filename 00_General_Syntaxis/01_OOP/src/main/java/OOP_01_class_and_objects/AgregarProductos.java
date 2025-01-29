/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP_01_class_and_objects;
import java.util.Scanner;

public class AgregarProductos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Categoria;
        String nombreProducto;
        float precioProducto;
        int cantidadEnBodega;
        /* para agregar un producto usando class se usan los scanners con los mismos parametros,
           despues se llama el nombre de la class que se llamma Class_Product, se crea la clase:
        
           = new Class_Product(tipoProducto, nombreProducto, precioProducto, cantidadEnBodega);
             
            para llamar los metodos se introduce la clase.metodo();
        
            algo asi : Class_Product.mostrarInfo();
            
        */
        System.out.println("Ingrese la Categoria a la que pertenece el producto\n");
        Categoria= input.nextLine();
        System.out.println("Ingrese el nombre del producto\n");
        nombreProducto = input.nextLine();
        System.out.println("Ingrese el precio del producto\n");
        precioProducto = input.nextFloat();
        System.out.println("Ingrese la cantidad que hay en bodega del producto\n");
        cantidadEnBodega = input.nextInt();
        
        Class_Product Class_Product = new Class_Product(Categoria, nombreProducto, 
                                                    precioProducto, cantidadEnBodega);
        
        Class_Product.mostrarInfo();
        Class_Product.verificarGarantia();
        
        input.close(); // finaliza el scanner
    }
    
}
