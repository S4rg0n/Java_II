package pkg04_abstraccion.clases;

public abstract class Rectangulo extends Figuras{

    @Override
    public double calcularArea(double base, double altura){
        return (base*altura);
    }
}
