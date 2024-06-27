package pkg00_clases;

public class Galleta {

    // Atributos; por defecto tienen modificador tipo public, accesible desde cualquier clase:
    private String tipo;
    private String forma;
    // Las siguientes declaraciones son igual a las 2 anteriores
    private String sabor;
    private String color;


    // Constructor por defecto (vacío):
    public Galleta(){
    }
    // Constructor con parámetros (sobrecarga de constructor, además del vacío, también con parámetros):
    public Galleta(String tipo, String forma, String sabor, String color) {
        this.tipo = tipo;
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
    }
    // Vamos a sobrecargar aún más con un constructor con la mitad de los parámetros:
    public Galleta(String tipo, String sabor){
        this.tipo = tipo;
        this.sabor = sabor;
    }
    // Otra sobrecarga, constructor mediante clonación:
    public Galleta(Galleta galleta){
        this.tipo = galleta.tipo;
        this.forma = galleta.forma;
        this.sabor = galleta.sabor;
        this.color = galleta.color;
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


    // Métodos; aquí el modificador default permite acceso desde el mismo paquete.
    void receta1(){
        System.out.println("Hornear y baño de chocolate");
    }
    void receta2(){
        System.out.println("Hornear y baño de vainilla");
    }
    void receta3(){
        System.out.println("Moldear y hornear");
    }

    @Override
    public String toString() {
        return "Galleta {" +
                "tipo='" + tipo + '\'' +
                ", forma='" + forma + '\'' +
                ", sabor='" + sabor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
