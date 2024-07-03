package pkg02_matrices.pkg02e_ejercicios;

import java.util.Arrays;

public class Ej05_CopyofArray {
    public static void main(String[] args) {
/*
    5) Crear dos arrays, Los 2 tiene que ser de tamaño 10.
       Rellenar uno con números (puedes rellanarlo a mano, o utilizar el método fill)
       y copiarlo al otro usando CopyOf de Arrays.
       Finalmente mostrar los números copiados en el segundo array.
*/
        int[] array = new int[10];
        Arrays.fill(array, 5);
        int[] copiaArray = Arrays.copyOf(array, array.length);//Si damos mayor tamaño, rellena al final con 0's
        System.out.println();
        for (int i = 0; i < copiaArray.length; i++){
            if (i == copiaArray.length - 1) {
                System.out.println(copiaArray[i]);
            } else System.out.print(copiaArray[i]+", ");
        }
    }
}