package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTrasporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTrasporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

        public void atracarPuerto() {

            System.out.println("El transporte" + getIdTrasporte() + "Esta listo para ser descargado." );
        }

        public void mostrarDatos() {

            System.out.println("ID del transporte" + getIdTrasporte());
            System.out.println("Combustible" + getCombustible());
            System.out.println("Cantidad de Contenedores" + cantidadContenedores);

            double costoDeRecorrido
        }

    
}
