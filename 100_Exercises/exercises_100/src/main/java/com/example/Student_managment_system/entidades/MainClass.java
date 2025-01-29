package com.example.Student_managment_system.entidades;

public class MainClass {

    private String nombreCompleto;
    private int edad;
    private String email;
    private String direccionVivienda;
    private String numContacto;

    public MainClass (String nombreCompleto, int edad, String email, String direccionVivienda, String numContacto) {

        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.email = email;
        this.direccionVivienda = direccionVivienda;
        this.numContacto = numContacto;
    }

    public void mostratInfo() {
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Email: " + email);
        System.out.println("Direccion de Vivienda: " + direccionVivienda);
        System.out.println("Numero de Contacto: " + numContacto);
    }
}

