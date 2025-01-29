/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package _01_HashMaps;

import java.util.HashMap;
import java.util.Map;

// CRUD Básico
// 1. put(K key, V value) - Inserta o actualiza un par clave-valor.
// 2. get(Object key) - Recupera el valor asociado a la clave.
// 3. remove(Object key) - Elimina un par clave-valor basado en la clave.
// 4. replace(K key, V value) - Reemplaza el valor asociado con una clave existente.

// Consultas
// 5. containsKey(Object key) - Verifica si el mapa contiene una clave específica.
// 6. containsValue(Object value) - Verifica si el mapa contiene un valor específico.
// 7. isEmpty() - Verifica si el mapa está vacío.
// 8. size() - Devuelve el número de pares clave-valor.

// Operaciones Avanzadas
// 9. putIfAbsent(K key, V value) - Agrega un par clave-valor solo si la clave no existe.
// 10. getOrDefault(Object key, V defaultValue) - Devuelve el valor asociado o un valor por defecto.
// 11. compute(K key, BiFunction remappingFunction) - Calcula un nuevo valor para una clave.

// Manipulación de Claves y Valores
// 12. keySet() - Devuelve un conjunto (Set) de todas las claves.
// 13. values() - Devuelve una colección de todos los valores.
// 14. entrySet() - Devuelve un conjunto (Set) de entradas (pares clave-valor).

// Iteración y Streams
// 15. forEach(BiConsumer action) - Itera sobre las entradas del mapa.
// 16. entrySet().stream() - Filtra y procesa pares clave-valor usando Streams.

// Eliminación Condicional
// 17. remove(Object key, Object value) - Elimina el par clave-valor solo si coincide con el valor.

// Reemplazo Condicional
// 18. replace(K key, V oldValue, V newValue) - Reemplaza el valor si coincide con el valor antiguo.

/*
 * The TreeMap is short by alphabetic or number order, otherwise the LinkedHashMap is for queue order, 
 * is store for come way and the classic HashMap no has non order
 * 
 * In the APIS REST, the LinkedHashMap is using for them, obviously handle incomplete information since it 
 * require constantly changes, otherwise the HashMap or TreeMap is for final or complete information.
 * 
*/

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        HashMap_works();
    }
    
    public static void HashMap_works() {
        Map<Integer, HashMap<String, String>> personas = new HashMap<>();

        // Crear un registro de persona
        HashMap<String, String> persona1 = new HashMap<>();
        persona1.put("nombreCompleto", "David Gonzalez");
        persona1.put("fechaNacimiento", "28-09-2001");
        persona1.put("edad", "22");
        persona1.put("salario", "2000");
        persona1.put("CuidadTrabajo", "Bogota D.C"); 

        // Agregar el registro al HashMap principal usando el ID como clave
        personas.put(23, persona1);

        // Recuperar el registro usando el ID
        HashMap<String, String> personaRecuperada = personas.get(23);

        // Mostrar los datos de la persona
        System.out.println("ID: 23");
        System.out.println("Nombre Completo: " + personaRecuperada.get("nombreCompleto"));
        System.out.println("Fecha de Nacimiento: " + personaRecuperada.get("fechaNacimiento"));
        System.out.println("Edad: " + personaRecuperada.get("edad"));
        System.out.println("Salario: " + personaRecuperada.get("salario"));
        System.out.println("Lugar de trabajo: "+personaRecuperada.get("CuidadTrabajo"));
        
    }    
    
}

