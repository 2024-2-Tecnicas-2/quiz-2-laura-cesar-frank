
package com.mycompany.quiz2;

  public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");
        Lancha lancha = new Lancha("Yamaha", "X24X");

        coche.acelerar();
        coche.acelerar();
        coche.frenar();
        
        lancha.acelerar();

        System.out.println(coche);
        System.out.println("Tipo de combustible del coche: " + coche.tipoCombustible());
        
        System.out.println(lancha);
        System.out.println("Tipo de combustible de la lancha: " + lancha.tipoCombustible());
    }
}
