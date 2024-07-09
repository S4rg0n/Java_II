package pkg02_matrices.pkg02e_ejercicios;

import javax.swing.*;

public class Ej10_ArrayBinarySearch {
    public static void main(String[] args) {
/*
    10) Creamos una array de tipo "int", con el tamaño que quieras.
        Introducimos los números, ya sea desde teclado, directamente al crearlo ó con Math.random().
        Luego lo ordenamos con el método que queramos.
        Finalmente hacemos una büsqueda binaria, buscando algún número.
*/
       int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca tamaño del array a buscar:"));
       int[] array = new int[tamanio];
       for(int i=0; i<array.length; i++){
           array[i] = (int)(Math.random()*101);
       }

       System.out.println("\nArray de tamaño "+tamanio+" generado con Math.random()");
       Ej06_ArrayBurbuja.mostrarArray(array);

        System.out.println("\nOrdenamos por método selección para realizar búsqueda binaria: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]){
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        System.out.println("Array ordenado:");
        Ej06_ArrayBurbuja.mostrarArray(array);
        int numBuscado = Integer.parseInt(JOptionPane.showInputDialog("Qué nº busca??"));
        
        int inicio = 0;
        int fin = array.length-1;
        int indiceBuscado = -1;
        while (inicio <= fin){
            int acotarMitad = (inicio + fin) / 2;
            if (array[acotarMitad] == numBuscado) {
                indiceBuscado = acotarMitad;
                break;
            } else if (array[acotarMitad] < numBuscado) {
                inicio = acotarMitad + 1;
            } else fin = acotarMitad - 1;
        }
        if (indiceBuscado == -1){
            System.out.println("Valor no existente en array.");
        } else System.out.println("Valor encontrado en índice "+indiceBuscado+" (posición "+(indiceBuscado+1)+")");
    }
}
