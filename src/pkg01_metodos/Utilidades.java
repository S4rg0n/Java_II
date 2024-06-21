package pkg01_metodos;

public class Utilidades {

    // Ejemplo de procedimiento, no devuelve nada, ni recibe parámetros:
    public void saludar(){
        System.out.println("Hola!!");
    }

    // Método: presenta parámetros, que recibirán unos argumentos (valores) para funcionar
    public double suma(int num1, int num2){
        double resultado = 0;
        resultado = num1 + num2;
        return resultado; // Siempre tiene un return. Éste puede dvolver un valor o no, pero ha de existir.
        // Lo que siguiera del return NO se ejecuta.
    }

}
