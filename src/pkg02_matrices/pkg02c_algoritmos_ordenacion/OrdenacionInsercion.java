package pkg02_matrices.pkg02c_algoritmos_ordenacion;

public class OrdenacionInsercion {
    public static void main(String[] args) {

        int[] matriz = {60, 50, 7, 9, 27, 15};

        System.out.println("\nMatriz sin ordenar: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n\n" : num+", ");
        }
        insercion(matriz);
        System.out.println("\nMatriz ordenada por método inserción: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n" : num+", ");
        }
    }

    private static void insercion(int[] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Comienzo vuelta "+i+" de bucle for:");
            int reemplazo = matriz[i];
            int j = i-1;
            while (j>-1 && matriz[j]>reemplazo){
                matriz[j+1] = matriz[j];
                for (int elemento : matriz){
                    System.out.print(elemento==matriz[matriz.length-1] ? elemento+"\n" : elemento+", ");
                }
                j--;
            }
            System.out.println("Fin del while "+i);
            matriz[j+1] = reemplazo;
            for (int elemento : matriz){
                System.out.print(elemento==matriz[matriz.length-1] ? elemento+"\n\n" : elemento+", ");
            }
        }
    }
}