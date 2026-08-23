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
        flota.add(buque);
        flota.add(camion);
    }
}