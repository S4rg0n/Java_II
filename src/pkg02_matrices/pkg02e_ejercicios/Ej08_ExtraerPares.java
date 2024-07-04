package pkg02_matrices.pkg02e_ejercicios;

import javax.swing.*;

public class Ej08_ExtraerPares {
    public static void main(String[] args) {
/*
    8) Crear 2 arrays de tipo "int" con tamaño 10.
       Pedir desde teclado los 10 números para rellanar el primer array.
       Luego comprobar cuáles de esos números son pares y guárdalos en el segundo array.
       Finalmente muestra por consola los números pares.
*/
        int[] array = new int[10];
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca valor nº "+(i+1)));
        }
        System.out.println("Ha introducido usted el siguiente array: ");
        Ej06_ArrayBurbuja.mostrarArray(array);
        int[] arrayPares = pares(array);
        System.out.println("Los números pares son:");
        for (int i = 0; i < arrayPares.length; i++) {
            if (i == arrayPares.length-1){
                System.out.print(arrayPares[i]);
            } else System.out.print(arrayPares[i]+", ");
        }

    }

    private static int[] pares(int[] array) {
        // Cuántos pares contiene el array???:
        int numPares = 0;
        for (int num : array){
            if (num%2 == 0){
                numPares++;
            }
        }
        // Ese es el rango de nuestro nuevo array:
        int[] arrayPares = new int[numPares];
        // Volvemos a barrer el array original para rellenar el nuevo:
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                arrayPares[j] = array[i];
                j++;
            }
        }
        return arrayPares;
    }
}