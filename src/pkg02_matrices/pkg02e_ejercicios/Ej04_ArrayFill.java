package pkg02_matrices.pkg02e_ejercicios;

import java.util.Arrays;

public class Ej04_ArrayFill {
    public static void main(String[] args) {
/*
        4) Rellenar un array de 10 numeros (int) usando el metodo fill de la clase
        Arrays. Y muéstralos por consola
*/
        int[] array = new int[10];
        Arrays.fill(array, 1);
        for (int i=0;i< array.length;i++){
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else System.out.print(array[i]+", ");
        }
    }
}