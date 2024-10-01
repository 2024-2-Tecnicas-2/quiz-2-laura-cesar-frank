
package com.mycompany.quiz2;

abstract class VehiculoBase implements Vehiculo{
            
            
          private String marca;
          private String modelo;
          private int velocidadActual;
          private String tipoDeCombustible;
          
          
          
          public VehiculoBase (String marca,String modelo){
              
              this.marca = marca;
              this.modelo = modelo;
              this.velocidadActual = 0;
              
          }
}
