package pkg01_metodos.ejercicios_metodos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        boolean eleccionValida = true;
        int eleccion = 0;

        do {
            try{
                eleccion = Integer.parseInt(JOptionPane.showInputDialog(
                                "Qué ejercicio desea realizar??\n" +
                                        "1: Getters y setters\n" +
                                        "2: Añadir IVA\n" +
                                        "3: Realizar operanción\n"
                        )
                );
                if (eleccion == 1 || eleccion == 2 || eleccion == 3){
                    eleccionValida = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Introduza nº de ejercicio válido.");
                }
            } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Error, ingrese 1, 2 ó 3.");
            }
        }while (eleccionValida);


        switch (eleccion){
            case 1:
                JOptionPane.showMessageDialog(null, "Enunciado en consola.");
                System.out.println("\nCrear un programa que haga lo siguiente:\n" +
                        "   Crear una clase llamada \"Automóvil\", esta clase contará con los siguientes características:\n" +
                        "    Atributos:\n" +
                        "      marca (String)\n" +
                        "      color (String)\n" +
                        "      potencia (int)\n" +
                        "      precio (double)\n" +
                        "    Métodos:\n" +
                        "      Getters y Setters para cada atributo.\n" +
                        "      Un método que permita visualizar todas las características del automóvil. (ya sea por\n" +
                        "      consola o con JOptionPane)\n" +
                        "      Finalmente crear una clase que contenga el método \"public static void main\" y crea un par de\n" +
                        "      objetos de la clase Automóvil. Asígnale valores a los objetos y prueba el programa:");

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
                break;


            case 2:
                JOptionPane.showMessageDialog(null, "Enunciado en consola.");
                System.out.println("\nLee un número por teclado que pida el precio de un producto (puede tener\n" +
                        "   decimales) y calcule el precio final con IVA. EI IVA será del 21%.\n" +
                        "   Utilizar métodos. Por ejemplo, un método encargado de pedir por teclado, otro\n" +
                        "   método que se encargue del calculo y otro método encargado de mostrar el resultado.");

                CalcularPrecio valor = new CalcularPrecio();
                valor.mostrarPrecioFinal();
                break;


            case 3:
                JOptionPane.showMessageDialog(null, "Enunciado en consola.");
                System.out.println("\nCrea una aplicaciön tipo calculadora, nos pedirå 2 operandos (int) y un signo\n" +
                        "   aritmético (String), segün este éltimo se realizara la operación correspondiente. Al\n" +
                        "   final mostrara el resultado en un cuadro de diálogo (JOptionPane).\n" +
                        "   Los signos aritméticos disponibles son:\n" +
                        "      +: suma los dos operandos.\n" +
                        "      -: resta los operandos.\n" +
                        "      *:multiplica los operandos.\n" +
                        "      /: divide los operandos, este debe dar un resultado con decimales (double)\n" +
                        "      %: mödulo, resto de la divisiön entre operandol y operando2.\n" +
                        "  Utilizar métodos para realizar el ejercicio. Por ejemplo, un método para cada acción.");

                Calculadora calculo = new Calculadora();
                calculo.iniciar();
                break;
        }

    }
}
