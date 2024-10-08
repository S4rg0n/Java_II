package pkg03_herencia.vehiculos.automovil.moto;

import pkg03_herencia.vehiculos.automovil.Automovil;

public class Moto extends Automovil {
    // Atributos:
    protected int marchas;

    // Getters y setters:

    public int getMarchas() {
        return marchas;
    }
    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }


    @Override
    public String toString() {
        return "Moto{" +
                "marchas=" + marchas +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", MUM_BASTIDOR=" + MUM_BASTIDOR +
                '}';
    }
}
