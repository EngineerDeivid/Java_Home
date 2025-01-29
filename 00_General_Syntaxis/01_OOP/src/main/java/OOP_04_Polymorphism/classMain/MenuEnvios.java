package OOP_04_Polymorphism.classMain;

// Importación de precios por Ciudad
import OOP_04_Polymorphism.PrecioCuidad.EnvioCartagena;
import OOP_04_Polymorphism.PrecioCuidad.EnvioBogota;

// Importación de precios por Categorías
import OOP_04_Polymorphism.Categorias.CategoriaAlimentos;
import OOP_04_Polymorphism.Categorias.CategoriaFarmacos;
import OOP_04_Polymorphism.Categorias.CategoriaElectrodomesticos;

// Importación de estructuras de datos
import java.util.LinkedList;
import java.util.Deque;

/*
 */
public class MenuEnvios {

    // Estructura para guardar los envíos
    private static Deque<Envio> listaEnvios = new LinkedList<>();

    public static void main(String[] args) {
        // Creación de categorías
        CategoriaAlimentos alimentos = new CategoriaAlimentos();
        CategoriaFarmacos farmacos = new CategoriaFarmacos();
        CategoriaElectrodomesticos electrodomesticos = new CategoriaElectrodomesticos();

        // Precios por ciudad
        EnvioCartagena cartagenaPrecio = new EnvioCartagena();
        EnvioBogota bogotaPrecio = new EnvioBogota();

        // Creación de envíos
        Envio envio1 = new Envio(cartagenaPrecio, alimentos, "Arroz", "Bolsa de arroz de 1kg", 15, 5000);
        Envio envio2 = new Envio(bogotaPrecio, farmacos, "Dolex Forte", "Tableta de 500mg", 20, 10000);
        Envio envio3 = new Envio(bogotaPrecio, electrodomesticos, "Licuadora", "Licuadora de alta velocidad", 5, 120000);

        // Guardar envíos
        guardarEnvios(envio1);
        guardarEnvios(envio2);
        guardarEnvios(envio3);

        // Mostrar la lista de envíos
        mostrarListaEnvios();
    }
    
 
    // Método para guardar envíos en la lista
    public static void guardarEnvios(Envio envio) {
        listaEnvios.add(envio); // Añade el envío al final de la lista
        System.out.println("Envio guardado exitosamente!\n");
    }

    // Método para mostrar todos los envíos guardados
    public static void mostrarListaEnvios() {
        System.out.println("\nLista de Envios Guardados:\n");
        for (Envio envio : listaEnvios) {
            System.out.println(envio.getDetallesEnvio());
        }
    }
}
