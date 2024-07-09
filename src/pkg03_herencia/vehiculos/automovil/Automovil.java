package pkg03_herencia.vehiculos.automovil;

public class Automovil {
    // Atributos:
    protected String marca;
    protected String matricula;

    // Creamos un constructor vacío:
    public Automovil(){
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
