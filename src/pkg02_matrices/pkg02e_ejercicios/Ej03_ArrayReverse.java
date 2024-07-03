package pkg02_matrices.pkg02e_ejercicios;

public class Ej03_ArrayReverse {
    public static void main(String[] args) {
/*
        3) A partir de un array de números de 5 posiciones con los siguientes
           valores guardar los valores de este array en otro array distinto,
           pero con los valores invertidos, es decir, que el segundo array deberá
           tener los valores {5,4,3,2,1}.
*/
        int[] array = {1,2,3,4,5};
        System.out.println("\nArray inicial: ");
        for (int element : array){
            System.out.print(element == array[array.length-1] ? element : element+", ");
        }
        int[] reverseArray = reverse(array);
        System.out.println("\nArray invertida: ");
        for (int element : reverseArray){
            System.out.print(element == reverseArray[reverseArray.length-1] ? element : element+", ");
        }
    }

    private static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i]= array[array.length - (i+1)];
        }
        return reversed;
    }
}
