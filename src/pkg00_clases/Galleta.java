package pkg00_clases;

public class Galleta {

    // Atributos; por defecto tienen modificador tipo public, accesible desde cualquier clase:
    private String tipo;
    private String forma;
    // Las siguientes declaraciones son igual a las 2 anteriores
    private String sabor;
    private String color;

    // Constructor
    public Galleta(){

    }

    // getters y setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Métodos; aquí el modificador default
    void receta1(){
        System.out.println("Hornear y baño de chocolate");
    }
    void receta2(){
        System.out.println("Hornear y baño de vainilla");
    }
    void receta3(){
        System.out.println("Moldear y hornear");
    }

}
