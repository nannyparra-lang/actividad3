package com.example;

public class Transporte {

    private String idTrasporte;
    private double combustible;
    private double capacidadCarga;

    
    public Transporte(String idTrasporte, double combustible, double capacidadCarga) {
        this.idTrasporte = idTrasporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }


    public String getIdTrasporte() {
        return idTrasporte;
    }


    public void setIdTrasporte(String idTrasporte) {
        this.idTrasporte = idTrasporte;
    }


    public double getCombustible() {
        return combustible;
    }


    public void setCombustible(double nivel) {
        if (nivel < 0) {
            combustible = 0;
        } else if (nivel > 100) {
            combustible = 100;
        } else {
            combustible = nivel;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }


    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println( "Error, El valor no puede ser negativo");
        } else {
            capacidadCarga = carga;
        }

    }

    public void viajar (int distancia) {

        double combustibleGastado = distancia / 10;
        combustible = combustible - combustibleGastado;
    }



}
