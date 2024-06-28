package pkg02_matrices.pkg02a_matrices_unidimensional;

public class Main {
    public static void main(String[] args) {
        //Inicialización de una matriz unidimensional:
        int[] listaNums = new int[10];
        System.out.println("\nRango de matriz: "+listaNums.length);

        //Damos valor con estructura de iteración for:
        System.out.println("Asignación e impresión de valores mediante bucle for:");
        for (int i = 0; i < listaNums.length; i++) {
            listaNums[i] = i;
            System.out.print(i==9 ? i+"\n" : i+", ");
        }
        //Otra forma de recorrer un array es el for-each
        System.out.println("\nLectura e impresión con for-each:");
        for (int num : listaNums){
            if (num == listaNums[listaNums.length-1]) {
                System.out.println(num+"\n");
            }else {
                System.out.print(num+", ");
            }
        }
    }
}