package pkg02_matrices.pkg02c_algoritmos_ordenacion;

public class OrdenacionBurbuja {
    public static void main(String[] args) {

        int[] matriz = {26, 50, 7, 9, 15, 27, 8};

        System.out.println("\nMatriz sin ordenar: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n\n" : num+", ");
        }
        burbuja(matriz);
        System.out.println("\nMatriz ordenada por método burbuja: ");
        for (int num : matriz){
            System.out.print(num==matriz[matriz.length-1] ? num+"\n" : num+", ");
        }
    }

    private static void burbuja(int[] matriz){
        int cambio;
        int comparacion = 1;
        System.out.println("\nProceso de ordenación: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length; j++) {
                System.out.println("Comparación nº "+comparacion+"  i= "+i+"  j= "+j);
                if (matriz[j] < matriz[j-1]) {
                    cambio = matriz[j];
                    matriz[j] = matriz[j-1];
                    matriz[j-1]=cambio;
                    comparacion++;
                } else {comparacion++;}
                for (int num : matriz){
                    System.out.print(num==matriz[matriz.length-1] ? num+"\n\n" : num+", ");
                }
            }
        }
    }
}