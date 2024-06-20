package pkg00_clases;

import javax.lang.model.element.NestingKind;

public class Galleta {

    // Atributos; por defecto tienen modificador tipo public, accesible desde cualquier clase:
    String tipo;
    String forma;
    // Las siguientes declaraciones son igual a las 2 anteriores
    public String sabor;
    public String color;

    // Constructor
    public Galleta(){

    }

    // Métodos; aquí el modificador default
    void receta1(){
        System.out.println("Hornear y baño de chocolate");
    }
    void receta2(){
        System.out.println("Hornear y baño de vainilla");
    }
    void receta3(){
        System.out.println("Moldear y hornear");
    }

}
