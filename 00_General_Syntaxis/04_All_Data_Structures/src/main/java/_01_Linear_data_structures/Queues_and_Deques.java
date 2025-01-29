package _01_Linear_data_structures;
import java.util.*;


public class Queues_and_Deques {
	public static void main (String[] args) {
		System.out.println("Here there are many queues!");
		Deque<String> ListaLibros = new LinkedList<>();
		
		System.out.println("Used of DEQUES. \n"
                + "Is the one of more importants DS, since is use for everthing, in bussines apps and "
                + "ecommerce apps, so usefull!\n");

		ListaLibros.add("WWZ");
		ListaLibros.add("Guerra InterEstelar");
		ListaLibros.add("Gaiden Jiraiya el valiente");
		ListaLibros.addFirst("Z HALO");
        
        int i =0;
        for (String it : ListaLibros) {
            i += 1;
            System.out.println(i+". "+it);
        }
        System.out.println("\n");
        
        
        ListaLibros.removeFirst();
        ListaLibros.removeLast();
        
        System.out.println(". "+ListaLibros.getFirst()+"\n. "+ListaLibros.getLast()+"\n");
		
	}
	
	public static void ejemplo_con_queue() {
		Queue<Integer> colas = new LinkedList<>();
        colas.add(1002);
        colas.add(1000000);
        colas.add(2300);
        colas.add(10000);
        colas.add(4500);
        
        for (int i : colas) {
            System.out.println("$"+i+" de pesos.");
        }
        System.out.println("\n");
	}
}
