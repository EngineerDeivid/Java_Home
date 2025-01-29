package _01_Linear_data_structures;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.Map;


public class Z_01 {

    public static void main(String[] args) {
        // Here we've done a code using Sets, TreeMaps, linkedlist and Queues.
        System.out.println("WELCOME TO THIS PROGRAM, TODAY WE'LL SEE SOME EXAMPLES USING LINKEDLIST, ARRALIST, TREEMAPS, SETS AND QUEUES.");
        Scanner input = new Scanner (System.in);
        Queue<String> colitas = new LinkedList<>();
        
        colitas.add("Cola super grande");
        colitas.add("Cola grande");
        colitas.add("Cola mediana");
        colitas.add("Cola pequena");
        colitas.add("Cola chiquita");
        colitas.add("Cola medio-seca");
        colitas.add("Tabla HPTA");
        colitas.add("Aqui esta la cola de mi novia");
        colitas.add("Aqui van mis ex, tablas hptas!");
        colitas.add("Esa culona me come muy bien");
        colitas.add("La cola ahora es mas grande");
    
        int i = 1;

        for (String cola : colitas) {
                System.out.println(i + ". Tipos de cola: "+ cola);
                i++;
        }
        
        HashSet<Integer> ID_user = new HashSet<>();
        Random random = new Random();
        
        int iD;
        do {
            iD = random.nextInt(10000) + 1;
        } while (!ID_user.add(iD));
        
        TreeMap<String, LinkedList<String>> listaGeneral = new TreeMap <>();
        LinkedList<String> todasLas_Colitas = new LinkedList<>(colitas);
        
        String iD_key = ID_user.toString();
        listaGeneral.put(iD_key, todasLas_Colitas);
        
        for (Map.Entry<String, LinkedList<String>> cadaItem : listaGeneral.entrySet()) {
            String clave =  cadaItem.getKey();
            LinkedList<String> valor = cadaItem.getValue();
            System.out.println("ID por cada cola : " +clave+ " | tipo de cola : "+ valor);
        }
    }
}
