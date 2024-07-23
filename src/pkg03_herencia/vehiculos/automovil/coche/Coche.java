package pkg03_herencia.vehiculos.automovil.coche;

import pkg03_herencia.vehiculos.automovil.Automovil;

public class Coche extends Automovil {
    // Atributos, además de los heredados de Automovil:
    protected String modelo;
    protected String color;
    protected int velocidadMaxima;

    // Constructores:
    public Coche(){
        super();
    }
    public Coche(String modelo, int velocidadMaxima, String marca, String matricula, String color, int NUM_BASTIDOR){
        super(NUM_BASTIDOR, marca, matricula);
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
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

    @Override
    public String toString() {
        return "Coche { " +
                "modelo = '" + modelo + '\'' +
                ", color = '" + color + '\'' +
                ", velocidadMaximaStandard = " + super.velocidadMaxima +
                ", velocidadMaximaModelo = " + velocidadMaxima +
                ", marca = '" + marca + '\'' +
                ", matricula = '" + matricula + '\'' +
                ", MUM_BASTIDOR = " + MUM_BASTIDOR +
                " }";
    }
}
