package pkg01_metodos;

public class Main {
    public static void main(String[] args) {

        Utilidades accion = new Utilidades();
        accion.saludar();

        // Ante sobrecarga de método, Java determina que tipos de parámetros se introducen y escoge el adecuado.
        double resultado = accion.suma(1,5);
        System.out.println("La suma de 1 y 5 es  1+5 = "+resultado);
        resultado = accion.suma(2.5,5);
        System.out.println("La suma de 2.5 y 5 es  2.5+5 = "+resultado);
        resultado = accion.suma("1","5");
        System.out.println("La suma de 1 y 5 pasados como string es  1+5 = "+resultado);
    }
}
