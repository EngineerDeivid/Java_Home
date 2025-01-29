package com.example.Convert_Temperatures;
import java.util.Scanner;


public class Convert_Temperatures {

    public static  void main (String[] args) {
    Scanner input = new Scanner(System.in);
    double firstTemperature;

        System.out.println("\nWelcome, today we gonna go to convert the temperature!\n");
        System.out.println("We began with grades Celcius for the operations\n");
        System.out.println("Please enter the temeperature!\n");
        firstTemperature = input.nextDouble();
        System.out.println("\nThe temperature choose is... "+firstTemperature+" Celcius.\n");
        int option = 0;

        do {
            System.out.println("AND NOW WE'LL TO CONVERT THE TEMPERATURE CHOOSE IN OTHER UNITS!\n");
            System.out.println("Choose one of the following options:");
            System.out.println("1. Fahrenheit");
            System.out.println("2. Kelvin");
            System.out.println("3. Rankine ");
            System.out.println("4. Exit\n");
            option = input.nextInt();

            switch (option) {
                case 1 -> System.out.println("The temperature in Fahrenheit is: "+ convert_to_Fahrenheit(firstTemperature));
                case 2 -> System.out.println("The temperature in Kelvin is: "+ convert_to_Kelvin(firstTemperature));
                case 3 -> System.out.println("The temperature in Rankine is: "+ convert_to_Rankine(firstTemperature));
                case 4 -> System.out.println("Thank you for using our app! Goodbye!");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (option != 4);
        input.close();
    }

    public static double convert_to_Fahrenheit(double Celcius) {
        return ((Celcius * 9/5) + 32);
    }

    public static double convert_to_Kelvin(double Celcius) {
        return (Celcius + 273.15);
    }

    public static double convert_to_Rankine (double Celcius) {
        return ((Celcius + 273.15) * 9/5);
    }
}