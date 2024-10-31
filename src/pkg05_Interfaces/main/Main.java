package pkg05_Interfaces.main;

import pkg05_Interfaces.clases.Acumulador;

public class Main {
    public static void main(String[] args) {
        Acumulador acumulador = new Acumulador(25);
        acumulador.incremento(15);
        System.out.println("acumulador.getValor() = " + acumulador.getValor());
        acumulador.multiplicador(3);
        System.out.println("acumulador.getValor() = " + acumulador.getValor());
    }
}
