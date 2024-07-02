package pkg02_matrices.pkg02d_algoritmos_busqueda;

public class BusquedaSecuencial_v02 {
    public static void main(String[] args) {
        int[] matriz = {26, 50, 7, 9, 15, 27, 9, 8};
        int numBuscado = 9;
        String indices = secuencial(matriz, numBuscado);
        System.out.println(indices.equals("-1") ? "\nNo existe tal valor en el array." : "\nEl valor "+numBuscado+" se encuentra en las posiciones "+indices);
    }
    public static String secuencial(int[] matriz, int num){
        String indices = "";
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == num) {
                indices += ((i+1) + " ");
            }
        }
        return indices.isEmpty() ? "-1" : indices;
    }
}
