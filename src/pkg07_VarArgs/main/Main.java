package pkg07_VarArgs.main;

import pkg07_VarArgs.utils.Utilidades;

public class Main {
    public static void main(String[] args) {

        Utilidades utilidades = new Utilidades();
        utilidades.calcular(1,3,5,7,9 );
        utilidades.calcular2(4, 6, 1, 3, 5, 7, 9);
    }
}
