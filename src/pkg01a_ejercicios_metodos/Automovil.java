package pkg01a_ejercicios_metodos;
//    1) Crear un programa que haga 10 siguiente:
//    Crear una clase llamada "Automóvil", esta clase contará con los siguientes características:

import javax.swing.*;

public class Automovil {
//    Atributos:
//    Marca (String)
//    Color (String)
//    Potencia (int)
//    Precio (double)
    private String marca;
    private String color;
    private int potencia;
    private double precio;

//    Métodos:
//    Getters y Setters para cada atributo.
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

//    Un método que permita visualizar todas las características del automóvil. (ya sea por consola o con JOptionPane)
    public String toString() {
        return "\nAutomovil { " +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                " }";
    }
    public void verCaracteristicas(Object coche){
        String infoCoche = coche.toString();
        JOptionPane.showMessageDialog(null, infoCoche);
    }

//    Finalmente crear una clase que contenga el método "public static void main" y crea un par de
//    objetos de la clase Automóvil. Asígnale valores a los objetos y prueba el programa
}
