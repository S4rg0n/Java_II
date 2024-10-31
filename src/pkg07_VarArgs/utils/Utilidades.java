package pkg07_VarArgs.utils;

public class Utilidades {

    public void calcular(int... v){
        int suma = 0;
        System.out.println("\nNúmero de argumentos: "+ v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Número a sumar: "+ v[i]);
            suma += v[i];
        }
        System.out.println("suma = " + suma);
    }

    public void calcular2(int a, int b, int... v){
        int suma = 0;
        System.out.println("\nNúmero de argumentos: "+ v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Número a sumar: "+ v[i]);
            suma += v[i];
        }
        suma += a;
        suma += b;
        System.out.println("suma = " + suma);
    }
}
