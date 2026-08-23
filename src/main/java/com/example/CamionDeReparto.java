package com.example;

public class CamionDeReparto extends Transporte {
    
    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTrasporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTrasporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            
            double combustibleGastado = distancia / 10 * 2;

            
            setCombustible(getCombustible() - combustibleGastado);
        } else {
            double combustibleGastado = distancia / 10.0;

            setCombustible(getCombustible() - combustibleGastado);
        }
    }

    
}
