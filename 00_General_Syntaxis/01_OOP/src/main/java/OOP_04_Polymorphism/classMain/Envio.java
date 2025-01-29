package OOP_04_Polymorphism.classMain;

// Asegúrate de importar las interfaces y clases necesarias
import OOP_04_Polymorphism.PrecioCuidad.PrecioCiudad;
import OOP_04_Polymorphism.Categorias.Categorias;

public class Envio {

    private PrecioCiudad precioCiudad;
    private Categorias categorias;
    private double PrecioTotal; // Precio total del envío
    private String NombreProducto;
    private String Descripcion;
    private int Cantidad; // Cantidad del producto
    private double PrecioProducto; // Precio unitario del producto

    // Constructor
    public Envio(PrecioCiudad precioCiudad, Categorias categorias, String NombreProducto, String Descripcion, int Cantidad, double PrecioProducto) {
        this.precioCiudad = precioCiudad;
        this.categorias = categorias;
        this.NombreProducto = NombreProducto;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.PrecioProducto = PrecioProducto;
        calcularPrecioTotal(); // Calcula el precio total al inicializar
    }

    // Método para calcular el precio total del envío
    private void calcularPrecioTotal() {
        double precioCategoriaCiudad = precioCiudad.calcularPrecioTotal(categorias);
        double precioProductos = PrecioProducto * Cantidad;
        this.PrecioTotal = precioCategoriaCiudad + precioProductos;
    }

    // Getters
    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public String getDetallesEnvio() {
        return  "Detalles del Envio:\n" +
                "Categoria: " + categorias.OntenerNombreCategoria() + "\n" +
                "Precio por Categoria: $" + categorias.ObtenerValorCategoria() + "\n" +
                "Ciudad: " + precioCiudad.obteberCuidad() + "\n" +
                "Precio Envio por Ciudad: $" + precioCiudad.obtenerPrecioCiudad() + "\n" +
                "Producto: " + NombreProducto + "\n" +
                "Descripcion: " + Descripcion + "\n" +
                "Cantidad: " + Cantidad + "\n" +
                "Precio por Producto: $" + PrecioProducto + "\n" +
                "Precio Total del Envio: $" + PrecioTotal + "\n";
    }
}
