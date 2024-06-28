package pkg02_matrices.pkg02b_matrices_bidimensionales;

public class Main {
    public static void main(String[] args) {
        //Inicialización de una matriz bidimensional:
        int[][] matrizNums = new int[10][10];
        System.out.println("\nRango de matriz: "+matrizNums.length);

        //Damos valor con estructura de iteración for:
        System.out.println("Asignación e impresión de valores mediante bucle for:");
        int casilla = 1;
        for (int i = 0; i < matrizNums.length; i++) {
            for (int j = 0; j < matrizNums.length; j++) {
                matrizNums[i][j] = casilla;
                System.out.print(j==9 ? matrizNums[i][j]+"\n" : matrizNums[i][j]+" ");
                casilla++;
            }
        }

        //Otra forma de recorrer un array es el for-each
        System.out.println("\nLectura e impresión con for-each:");
        for (int[] fila : matrizNums){ // Para cada fila de la matriz...
            for (int elemColumna : fila){ // ... recorre cada elemento de la fila...
                System.out.print(elemColumna+" "); //... imprímelo ...
            }
            System.out.println(); // ... y salta de línea al terminar la fila
        }

    }
}
