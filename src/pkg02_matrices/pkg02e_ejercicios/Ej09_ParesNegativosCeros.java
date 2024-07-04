package pkg02_matrices.pkg02e_ejercicios;

import java.util.Scanner;

public class Ej09_ParesNegativosCeros {
    public static void main(String[] args) {
/*
    9) Crea un programa que guarda en un array 10 números enteros (tamaño 10, tipo int) que se leen por teclado.
       A continuación, se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.
*/
        int[] array = new int[10];
        System.out.println();
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca valor nº "+(i+1));
            array[i] = scn.nextInt();
        }
        scn.close();
        System.out.println("\nEl array es el siguiente:");
        Ej06_ArrayBurbuja.mostrarArray(array);

        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        for (int num : array){
            if (num <0) negativos++;
            else if (num > 0) {
                positivos++;
            }else ceros++;
        }
        System.out.println("\nExsiten "+positivos+" valores positivos, "+negativos+" negativos y "+ceros+" ceros.");
    }
}
