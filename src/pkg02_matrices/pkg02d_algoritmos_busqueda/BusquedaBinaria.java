package pkg02_matrices.pkg02d_algoritmos_busqueda;

import pkg02_matrices.pkg02c_algoritmos_ordenacion.OrdenacionSeleccion;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] matriz = {26, 50, 7, 9, 15, 27, 8};
        int numBuscado = 27;
        //Este algoritmo de búsqueda requiere que la matriz esté ordenada, asi que haremos uso de la clase OrdenacionSeleccion:
        int[] matrizOrdenada = OrdenacionSeleccion.seleccion(matriz);
        int indices = binaria(matrizOrdenada, numBuscado);
        System.out.println(indices==-1 ? "\nEl "+numBuscado+"no existe en el array." : "\nEl "+numBuscado+" se encuentra en la posición "+(indices+1)+" (índice "+indices+")");
    }

    private static int binaria(int[] matriz, int numBuscado) {
        int inicio = 0;
        int fin = matriz.length-1;

        while(inicio <= fin){
            int ptomedio = (inicio + fin)/2;
            if (matriz[ptomedio] == numBuscado) {
                return ptomedio;
            }else if (matriz[ptomedio] < numBuscado) {
                inicio = ptomedio + 1;
            }else{
                fin = ptomedio - 1;
            }
        }
        return -1;
    }
}