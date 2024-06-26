package pkg01a_ejercicios_metodos;

public class Main {
    public static void main(String[] args) {

//  1) Crear un programa que haga 10 siguiente:
//     Crear una clase llamada "Automóvil", esta clase contará con los siguientes características:
//      Atributos:
//        marca (String)
//        color (String)
//        potencia (int)
//        precio (double)
//      Métodos:
//        Getters y Setters para cada atributo.
//        Un método que permita visualizar todas las características del automóvil. (ya sea por
//        consola o con JOptionPane)

//        Finalmente crear una clase que contenga el método "public static void main" y crea un par de
//        objetos de la clase Automóvil. Asígnale valores a los objetos y prueba el programa:

        Automovil coche1 = new Automovil();
        coche1.setMarca("Seat");
        coche1.setColor("Verde");
        coche1.setPotencia(120);
        coche1.setPrecio(24499.50);
        coche1.verCaracteristicas(coche1);

        Automovil coche2 = new Automovil();
        coche2.setMarca("Renault");
        coche2.setColor("Rojo");
        coche2.setPotencia(110);
        coche2.setPrecio(18499.50);
        System.out.println(coche2.toString());


//  2) Lee un número por teclado que pida el precio de un producto (puede tener
//     decimales) y calcule el precio final con IVA. EI IVA será del 21%.
//     Utilizar métodos. Por ejemplo, un método encargado de pedir por teclado, otro
//     método que se encargue del calculo y otro método encarga#o de mostrar el resultado.

        CalcularPrecio valor = new CalcularPrecio();
        valor.mostrarPrecioFinal();




    }
}
