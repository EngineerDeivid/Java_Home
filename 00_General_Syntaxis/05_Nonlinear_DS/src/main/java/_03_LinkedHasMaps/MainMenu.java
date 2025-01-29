/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _03_LinkedHasMaps;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int opcionMenu;
        do {
            System.out.println(""
                    + "1. Crear Envio. \n"
                    + "2. Ver lista de Envios. \n "
                    + "3. Editar informacion de Envio. \n"
                    + "4. Eliminar Envio. \n"
                    + "5. SALIR. \n");
            opcionMenu = input.nextInt();
            switch (opcionMenu) {
                case 1:
                case 2: 
                case 3:
                case 4:
                case 5:
                    
                default:
                    System.out.println("Error!");
            }
        } while (opcionMenu != 5);
    }
}
