package pkg05_Interfaces.clases;

import pkg05_Interfaces.interfaz.ModificacionA;
import pkg05_Interfaces.interfaz.ModificacionB;

public class Acumulador implements ModificacionA, ModificacionB {
    //Atributos:
    int valor;

    //Constructor:
    public Acumulador(int valor) {
        this.valor = valor;
    }

    //Getter-Setter:
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    //Adaptamos nuestro método heredado de la interfaz:
    @Override
    public void incremento(int a) {
        valor += a;
    }

    @Override
    public void multiplicador(double a) {
        valor *= (int) a;
    }
}
