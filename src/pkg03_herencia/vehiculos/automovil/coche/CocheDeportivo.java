package pkg03_herencia.vehiculos.automovil.coche;

public class CocheDeportivo extends Coche{
    // Atributos
    private int velocidadPunta;

    // Constructor vacío:
    public CocheDeportivo(){
    }

    // Getters y setters:
    public int getVelocidadPunta() {
        return velocidadPunta;
    }
    public void setVelocidadPunta(int velocidadPunta) {
        this.velocidadPunta = velocidadPunta;
    }
}
