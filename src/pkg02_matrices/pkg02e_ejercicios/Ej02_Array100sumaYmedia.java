package pkg02_matrices.pkg02e_ejercicios;

public class Ej02_Array100sumaYmedia {
    public static void main(String[] args) {
/*
        2) Crea un array de números de 100 posiciones (tamaño 100), que contendrá los números del 1 al 100.
           Obtener la suma de todos los números del array y obtener también la media.
*/
        int[] matriz = new int[100];
        delUnoAlCien(matriz);
        int sumatorio = sumatorioElementos(matriz);
        System.out.println("\nEl sumatorio de todos los elementos del array es igual "+sumatorio);
        double promedio = promedioElementos(matriz);
        System.out.println("El promedio de todos los elementos del array es igual "+promedio);
    }

    private static void delUnoAlCien(int[] matriz) {
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = i+1;
        }
    }

    public static int sumatorioElementos(int[] matriz){
        int sumatorio = 0;
        for (int element : matriz) {
            sumatorio += element;
        }
        return sumatorio;
    }

    public static double promedioElementos(int[] matriz){
        int sumatorio = sumatorioElementos(matriz);
        double promedio = sumatorio / matriz.length;
        return promedio;
    }
}
