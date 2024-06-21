package pkg01_metodos;

public class Main {
    public static void main(String[] args) {

        Utilidades accion = new Utilidades();
        accion.saludar();
        double resultado = accion.suma(1,5);
        System.out.println("La suma de 1 y 5 es  1+5 = "+resultado);
    }
}
