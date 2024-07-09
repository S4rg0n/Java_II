package pkg03_herencia.vehiculos.automovil.coche;

import pkg03_herencia.vehiculos.automovil.Automovil;

public class Coche extends Automovil {
    // Atributos, además de los heredados de Automovil:
    protected String modelo;
    // Constructor vacio:
    public Coche(){
    }

    // Getters y setters:
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método:
    public void ajustarAsiento(){
        System.out.println("Asiento ajustado.");
    }
}
