
package com.mycompany.quiz2;

  public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota","Camaro",100);
        Lancha lancha = new Lancha("Yamaha", "X24X", 250);

        Coche coche1 = new Coche("Ferrari", "Y502",150);
        Lancha lancha1 = new Lancha("Turbina", "T15",200);

        coche.acelerar();
        coche.acelerar();
        coche.frenar();
        
        lancha.acelerar();


        System.out.println("Marca coche: " + coche.getMarca() + ". Modelo coche: " + coche.getModelo());
        System.out.println("Tipo de combustible del coche: " + coche.tipoCombustible());
        System.out.println("Velocidad actual : " + coche.getVelocidadActual());
        System.out.println("Acelerar 2 veces");        
        coche.acelerar(); coche.acelerar();
        System.out.println("Velocidad actual : " + coche.getVelocidadActual() + "\n");

        System.out.println("Marca coche 2: " + coche1.getMarca() + ". Modelo coche 2 : " + coche1.getModelo());
        System.out.println("Tipo de combustible del coche 2: " + coche1.tipoCombustible());
        System.out.println("La Velocidad actual : " + coche1.getVelocidadActual());
        System.out.println("Acelerar 10 veces");        
        coche.acelerar(); coche.acelerar();
        System.out.println("La Velocidad actual : " + coche.getVelocidadActual() + "\n");
        
        System.out.println("El Tipo de combustible del Coche 2 : " + lancha.tipoCombustible());
    }
}
