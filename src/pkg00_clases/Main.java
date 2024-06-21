package pkg00_clases;

public class Main {
    public static void main(String[] args) {

        // Creamos un objeto Galleta:  Declaración = Instancia;
        Galleta galleta1 = new Galleta();
        Galleta galleta2 = new Galleta();

        galleta1.setForma("cuadrada");
        galleta1.setColor("marrón");
        galleta1.setSabor("chocolate");
        galleta1.setTipo("especial");

        System.out.println("\nNuestra primera galleta tiene forma "+galleta1.getForma()+".");

        galleta2.setForma("cuadrada");
        galleta2.setColor("marrón");
        galleta2.setSabor("chocolate");
        galleta2.setTipo("especial");

        // Aunque galleta1 y galleta2 son iguales, no son el mismo objeto:
        System.out.print("Si introducimos los mismos valores de atributo para 2 galletas diferentes, ");
        if (galleta2.equals(galleta1)) {
            System.out.println("son la misma.");
        } else {
            System.out.println("son iguales, pero distintas galletas almacenadas en espacios de memoria diferentes.");
        }

        System.out.print("Sin embargo, si lo que hacemos es crear galleta1, y asignamos galleta2 = galleta1, ");
        galleta2 = galleta1;

        if (galleta2.equals(galleta1)) {
            System.out.println("galleta2 apunta al espacio de memoria de galleta1, así que, en cierto modo, son la misma.");
        } else {
            System.out.println("Son iguales, pero distintas galletas.");
        }

    }
}
