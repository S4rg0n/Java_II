package pkg04_abstraccion.clases;

public abstract class Figuras {
    //Atributos:
    protected double base;
    protected double altura;
    protected String nombre;

    //Constructor, getters y setters
    public Figuras(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos:
    public abstract double calacularArea (double base, double altura);
}
