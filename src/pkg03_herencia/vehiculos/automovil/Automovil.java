package pkg03_herencia.vehiculos.automovil;

public class Automovil {
    // Atributos:
    protected String marca;
    protected String matricula;

    // Constante:
    final int MUM_BASTIDOR;

    // Creamos un constructor vacío:
    public Automovil(){
        MUM_BASTIDOR = 341234;
    }

    public Automovil(int MUM_BASTIDOR, String marca, String matricula) {
        this.MUM_BASTIDOR = MUM_BASTIDOR;
        this.marca = marca;
        this.matricula = matricula;
    }

    // Getters y setters:
    public String getMarca() {
        return marca;
    }
    public void setMarca(String maraca) {
        this.marca = maraca;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    // Métodos:
    public void acelerar(){
        System.out.println("Acelerando.");
    }
    public void frenar(){
        System.out.println("Frenando.");
    }
}
