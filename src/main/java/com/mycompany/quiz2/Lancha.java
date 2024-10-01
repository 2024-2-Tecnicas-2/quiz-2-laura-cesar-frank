package com.mycompany.quiz2;

public class Lancha extends VehiculoBase{
    
    public Lancha(String marca, String modelo) {
        super(marca, modelo, velocidadActual);
    }

    @Override
    public void acelerar() {
        super.setVelocidadActual(super.getVelocidadActual() + 20);
    }

    @Override
    public void frenar() {
        super.setVelocidadActual(super.getVelocidadActual() - 20);
    }

    @Override
    public Enum tipoCombustible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
