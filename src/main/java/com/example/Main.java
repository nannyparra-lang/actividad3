package com.example;

public class Main {
    public static void main(String[] args) {
        
        CamionDeReparto camion = new CamionDeReparto(true);






        BuqueCarga buque = new BuqueCarga(50);





        
        camion.setCombustible(-20);

        System.out.println("El combustible del camion es: " + camion.getCombustible());
    }
}