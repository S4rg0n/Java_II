package pkg04_abstraccion.clases;

public class Triangulo extends Figuras{
    // Atributo extra: rectángulo, isósceles, escaleno...
    String tipo;

    //Constructor heredado y añadido nuestro atributo extra
    public Triangulo(double base, double altura, String nombre, String tipo) {
        super(base, altura, nombre);
        this.tipo = tipo;
    }
    //Necesitamos getter y setter de nuestro atributo extra:
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Adaptamos calculo de área:
    @Override
    public double calacularArea(double base, double altura) {
        double area = (base * altura)/2;
        return area;
    }
}
