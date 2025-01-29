package OOP_01_class_and_objects;

// This class defines a product with its attributes and methods.
public class Class_Product {
    private String categoria; // Corrected variable name to follow Java conventions (camelCase)
    private String nombreProducto;
    private double precioProducto; // Changed `Double` to `double` (primitive type for consistency)
    private int cantidadEnBodega;

    // Constructor for initializing the product attributes
    public Class_Product(String categoria, String nombreProducto, double precioProducto, int cantidadEnBodega) {
        this.categoria = categoria; 
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadEnBodega = cantidadEnBodega;
    }

    // Method to display product information
    public void mostrarInfo() {
        System.out.println("Información del producto: \n" +
                "Categoría: " + this.categoria + "\n" +
                "Nombre del Producto: " + this.nombreProducto + "\n" +
                "Precio: $" + this.precioProducto + "\n" +
                "Cantidad en Bodega: " + this.cantidadEnBodega);
        System.out.println("PRECIO TOTAL: " + (this.precioProducto * this.cantidadEnBodega) + "\n");
    }

    // Method to verify if the product has a warranty
    public void verificarGarantia() {
        double garantia = 4000; // Changed `float` to `double` for consistency with product price
        double garantiaProducto;

        // Check if the category qualifies for a warranty
        if (this.categoria.equalsIgnoreCase("farmacia") || this.categoria.equalsIgnoreCase("insumosAlimenticios")) {
            garantiaProducto = this.precioProducto - garantia;
            System.out.println("El producto tiene una garantía de un bono de $" + garantia + "\n");

            if (garantiaProducto > 0) {
                System.out.println("El precio del producto después de la garantía es $" + garantiaProducto + "\n");
            } else if (garantiaProducto < 0) {
                System.out.println("Saldo a favor de $" + Math.abs(garantiaProducto) + 
                        " debido al bono acumulado que excedió el precio del producto.");
            } else {
                System.out.println("El precio del producto se cubrió completamente con la garantía.\n");
            }
        } else {
            System.out.println("Este producto no tiene garantía aplicable.\n");
        }
    }
}
