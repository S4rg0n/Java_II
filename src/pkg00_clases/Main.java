package pkg00_clases;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto Galleta:  Declaración = Instancia;
        Galleta galleta1 = new Galleta();
        Galleta galleta2 = new Galleta();

        galleta1.forma = "cuadrada";
        galleta1.color = "marrón";
        galleta1.sabor = "chocolate";
        galleta1.tipo = "especial";

        System.out.println("Nuestra primera galleta tiene forma "+galleta1.forma);

        galleta2.forma = "cuadrada";
        galleta2.color = "marrón";
        galleta2.sabor = "chocolate";
        galleta2.tipo = "especial";

        // Aunque galleta1 y galleta2 son iguales, no son el mismo objeto:
        if (galleta2.equals(galleta1)) {
            System.out.println("Son la misma.");
        } else System.out.println("Son iguales, pero distintas galletas.");

    }
}
