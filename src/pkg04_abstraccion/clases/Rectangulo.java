package pkg04_abstraccion.clases;

public class Rectangulo extends Figuras{

    public Rectangulo(double base, double altura, String nombre) {
        super(base, altura, nombre);
    }

    @Override
    public double calacularArea(double base, double altura) {
        double area = (base * altura);
        return area;
    }
}
