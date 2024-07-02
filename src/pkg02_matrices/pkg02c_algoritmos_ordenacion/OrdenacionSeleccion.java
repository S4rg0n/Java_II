package pkg02_matrices.pkg02c_algoritmos_ordenacion;

public class OrdenacionSeleccion {
    public static void main(String[] args) {

        int[] matriz = {26, 50, 7, 9, 15, 27, 8};

        System.out.println("\nMatriz sin ordenar: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n\n" : num+", ");
        }
        seleccion(matriz);
        System.out.println("\nMatriz ordenada por método burbuja: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n" : num+", ");
        }
    }

    private static void seleccion(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i+1 ; j < matriz.length; j++) {
                if (matriz[i] > matriz[j]) {
                    int reemplazo = matriz[j];
                    matriz[j] = matriz[i];
                    matriz[i] = reemplazo;
                }
            }
            for (int elemento : matriz){
                System.out.print(elemento==matriz[matriz.length-1] ? elemento+"\n" : elemento+", ");
            }
        }
    }
}