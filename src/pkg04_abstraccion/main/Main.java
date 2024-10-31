package pkg04_abstraccion.main;

import pkg04_abstraccion.clases.Rectangulo;
import pkg04_abstraccion.clases.Triangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5, "Rectángulo");
        Triangulo triangulo = new Triangulo(10, 5, "Triángulo", "Isósceles");

        System.out.println("triangulo.calacularArea(10, 5) = " + triangulo.calacularArea(10, 5));
        System.out.println("Triángulo de tipo "+ triangulo.getTipo().toLowerCase());
        System.out.println("rectangulo.calacularArea(10, 5) = " + rectangulo.calacularArea(10, 5));
    }
}
