
package com.mycompany.quiz2;

abstract class VehiculoBase implements Vehiculo{
            
            
          private String marca;
          private String modelo;
          private int velocidadActual;
          private String TipoCombustible;

          
          
          
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
