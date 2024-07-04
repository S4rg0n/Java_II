package pkg02_matrices.pkg02e_ejercicios;

import java.util.Scanner;

public class Ej06_ArrayBurbuja {
    public static void main(String[] args) {
/*
    6) Crear una array de cualquier tamaño. Rellenarlo con números.
       Mostrar el array sin ordenar por consola.
       Ordenar un array de números con el método de la burbuja.
       Mostar el array ordenado por consola.
*/
        int[] array = crearArray();
        System.out.println("\nEl array generado es de rango "+array.length+" y se ha creado con los siguientes valores:");
        mostrarArray(array);
        int[] arraySorted = bubleSort(array);
        System.out.println("\nArray ordenado por método burbuja:");
        mostrarArray(arraySorted);

    }


    public static int[] crearArray(){
        Scanner scn = new Scanner(System.in);
        System.out.println("\nDe qué tamaño desea el array??:");
        int rangoArray = scn.nextInt();
        int[] array = new int[rangoArray];
        scn.close();
        for (int i = 0; i < rangoArray; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }

    public static void mostrarArray(int[] arrayAmostrar){
        System.out.println();
        for (int i = 0; i < arrayAmostrar.length; i++) {
            if ((i+1)%10 == 0){
                System.out.print(arrayAmostrar[i]+"\n");
            } else System.out.print(arrayAmostrar[i]+"\t");
        }
        System.out.println();
    }

    public static int[] bubleSort(int[] arrayAordenar){
        for (int i = 0; i < arrayAordenar.length; i++) {
            for (int j = 1; j < arrayAordenar.length; j++) {
                if(arrayAordenar[j] < arrayAordenar[j-1]){
                    int reserva = arrayAordenar[j];
                    arrayAordenar[j] = arrayAordenar[j-1];
                    arrayAordenar[j-1] = reserva;
                }
            }
        }
        return arrayAordenar;
    }
}
