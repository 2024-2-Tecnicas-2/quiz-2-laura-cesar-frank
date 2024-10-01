package com.mycompany.quiz2;

public class Principal {


// Clase abstracta VehiculoBase
abstract class VehiculoBase implements Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    
    public void acelerar() {
        velocidadActual += 10; 
    }

 
    public void frenar() {
        velocidadActual -= 10; 
        if (velocidadActual < 0) {
            velocidadActual = 0; 
        }
    }
}
}

    
    
