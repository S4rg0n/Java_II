package pkg02_matrices.pkg02e_ejercicios;

import javax.swing.*;

public class Ej01_CrearMostrarArray {
    public static void main(String[] args) {
/*
      1) Crea un array o matriz de 10 posiciones (tamaño 10) de números con
         valores pedidos por teclado. Muestra por consola el índice de la matriz y
         el valor que le corresponde.
         Crea dos métodos, uno para rellenar valores y otro para mostrar.
*/
        int[] matriz = new int[10];
        rellenarArray(matriz);
        mostrarArray(matriz);
    }
    public static void rellenarArray(int[] matriz){
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca valor para matriz["+i+"]"));
        }
    }
    public static void mostrarArray(int[] matriz){
        System.out.println("\nEstos son los índices y valores asignados:");
        for (int i = 0; i < matriz.length; i++){
            System.out.println("matriz["+i+"] = "+matriz[i]);
        }
    }
}