package _00_General_Exceptions;
import java.util.Scanner;

public class Calculadora_en_Java {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int opcionMenu;
        
        
        do {
            System.out.println("");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potenciacion");
            System.out.println("6. Radicacion");
            System.out.println("7. Logaritmo");
            System.out.println("8. Convertir numero a binario");
            System.out.println("9. Salir");
            System.out.println("");
            
            opcionMenu = input.nextInt();
            
            switch (opcionMenu) {

                case 1:
                    double [] numerosSumar = obtenerNumeros(input);
                    System.out.println("Resultado de la suma: " + sumar(numerosSumar[0], numerosSumar[1])+"\n");
                    break;
                    
                case 2:
                    double [] numerosRestar = obtenerNumeros(input);
                    System.out.println("Resultado de la resta es: " + restar(numerosRestar[0], numerosRestar[1])+"\n");
                    break;

                case 3:
                    double [] numerosMult = obtenerNumeros(input);
                    System.out.println("Resultado de la multiplicacion es: " + multiplicar(numerosMult[0], numerosMult[1])+"\n");
                    break;
                    
                case 4:
                    double [] numerosDividir = obtenerNumeros(input);
                    try {
                        divirPorCero(numerosDividir[0], numerosDividir[1]);
                        System.out.println("Resultado: "+ dividir(numerosDividir[0], numerosDividir[1])+"\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Excepcion: " + e.getMessage()+"\n");
                    }
                    break;

                case 5:
                    double [] numerosPotenciar = obtenerNumeros(input);
                    System.out.println("Resultado de la potenciacion es: " + potenciar(numerosPotenciar[0], numerosPotenciar[1])+"\n");                
                    break;
                    
                case 6:
                    // Código para Radicación
                    System.out.println("\nIngrese el numero que desea para calcular la raiz:");
                    double numRadicar = input.nextDouble();
                    System.out.println("\nResultado de la radizacion: "+ Math.sqrt(numRadicar)+"\n");
                    break;

                case 7:
                    // Código para Logaritmo
                    System.out.println("\nIngrese el numero que desea para calcular el logaritmo:");
                    double numLog = input.nextDouble();
                    System.out.println("\nResultado de la radizacion: "+ Math.log10(numLog)+"\n");
                    break;

                case 8:
                    // Código para Convertir número a binario
                    System.out.println("\nIngrese el numero que desea convertir en Binario:");
                    int numtoBinaryNum = input.nextInt();
                    System.out.println("El numero "+numtoBinaryNum+" convertido en Binario es: "+Integer.toBinaryString(numtoBinaryNum)+"\n");
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Por favor, intente de nuevo.");
                    break;
                }
        } while (opcionMenu != 9);
    }
    

    
    
    public static double[] obtenerNumeros (Scanner input) {
        double[] numeros = new double[2];
        for (int i = 0; i < 2; i++) {
            boolean valido = false;
            
            while (!valido) {
                try {
                     System.out.println("Ingrese el " + (i + 1) + " número: "); // Mensaje dinámico
                    String entrada = input.next();
                    if (entrada.trim().isEmpty()) {
                        throw new IllegalArgumentException("El campo esta vacio...");
                    }
                    numeros[i] = Double.parseDouble(entrada);
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número válido.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            
        }
        
        return numeros;
    }
    
    
    public static void divirPorCero(double numero1, double numero2) throws IllegalArgumentException {
        if (numero1 == 0 || numero2 == 0) {
            throw new IllegalArgumentException("Error, no se puede dividir por cero!.\n");
        }
    }
    
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }
    
    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }
    
    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
    
    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
    
    // asi es como se debe hacer la excepcion con Throw 
    public static double potenciar(double base, double exponente) {
    if (base == 0 && exponente == 0) {
        throw new IllegalArgumentException("Indeterminado: No se puede calcular 0^0.\n");
    }
    return Math.pow(base, exponente); // Método estándar en Java para potencias
    }
    
}
