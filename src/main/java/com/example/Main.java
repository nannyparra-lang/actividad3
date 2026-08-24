package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        CamionDeReparto camion = new CamionDeReparto("346", 40, 36, true);
        BuqueCarga buque = new BuqueCarga("555", 20, 30, 50);
        camion.setCombustible(-20);
        System.out.println("El combustible del camion es: " + camion.getCombustible());
        
        ArrayList<Transporte> flota = new ArrayList <>();
        flota.add(camion);
        flota.add(buque);
        for( int i = 0; i < flota.size(); i++) {
            Transporte transporte = flota.get(i);
            transporte.viajar(100);
            System.out.println("ID: " + transporte.getIdTrasporte() + "combustible restante" + transporte.getCombustible());
        }
    }
}