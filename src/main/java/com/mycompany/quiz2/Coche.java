package com.mycompany.quiz2;

public class Coche extends VehiculoBase{
    
    public Coche(String marca, String modelo, int velocidadActual) {
        super(marca, modelo, velocidadActual);
        super.setTipoCombustible(Enum.TipoCombustible.DIESEL.toString());
    }
     @Override
    public void acelerar() {
        super.setVelocidadActual(super.getVelocidadActual() + 10);
    }

    @Override
    public void frenar() {
        super.setVelocidadActual(super.getVelocidadActual() - 10);
    }

    @Override
    public String tipoCombustible() {
        return super.getTipoCombustible();
    }

}
