package pkg02_matrices.pkg02d_algoritmos_busqueda;

public class BusquedaSecuencial_v01 {
    public static void main(String[] args) {
        int[] matriz = {26, 50, 7, 9, 15, 27, 8};
        int indice = secuencial(matriz, 12);
        System.out.println(indice==-1 ? "\nNo existe tal valor en el array." : "\nEl valor "+matriz[indice]+" se encuentra en la posición "+(indice+1)+" (Indice "+indice+")");
    }
    public static int secuencial(int[] matriz, int num){
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
