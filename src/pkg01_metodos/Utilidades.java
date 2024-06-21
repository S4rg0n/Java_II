package pkg01_metodos;

public class Utilidades {

    // Ejemplo de procedimiento, no devuelve nada, ni recibe parámetros:
    public void saludar(){
        System.out.println("Hola!!");
    }

    // Método: presenta parámetros, que recibirán unos argumentos (valores) para funcionar
    public int suma(double num1, double num2){
        double resultado = 0;
        resultado = num1 + num2;
        return (int)resultado; // Siempre tiene un return. Éste puede dvolver un valor o no, pero ha de existir.
        // Lo que siguiera del return NO se ejecuta.
    }
    // La sobrecarga de métodos nos permite asignar un mismo nombre de método para distintas parametrizaciones:
    public int suma(int num1, int num2){
        int resultado = 0;
        resultado = num1+num2;
        return resultado;
    }
    public int suma(String num1, String num2){
        int resultado = 0;
        resultado =  Integer.parseInt(num1) + Integer.parseInt(num2);
        return resultado;
    }

}
