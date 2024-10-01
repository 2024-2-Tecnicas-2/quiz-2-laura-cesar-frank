
package com.mycompany.quiz2;

abstract class VehiculoBase implements Vehiculo{
            
            
          private String marca;
          private String modelo;
          private int velocidadActual;
          private String TipoCombustible;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

          
          
          
          public VehiculoBase (String marca,String modelo, int velocidadActual){
              
              this.marca = marca;
              this.modelo = modelo;
              this.velocidadActual = velocidadActual;
          }
         @Override
         
          public void acelerar (){
              
              this.velocidadActual += 10;
          }
         @Override
         
         public void frenar (){
             this.velocidadActual -=10;
         }
              
        
}
