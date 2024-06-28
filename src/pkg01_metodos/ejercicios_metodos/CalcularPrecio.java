package pkg01_metodos.ejercicios_metodos;

import javax.swing.*;

public class CalcularPrecio {
//  2) Lee un número por teclado que pida el precio de un producto (puede tener
//     decimales) y calcule el precio final con IVA. EI IVA será del 21%.
//     Utilizar métodos. Por ejemplo, un método encargado de pedir por teclado, otro
//     método que se encargue del calculo y otro método encarga#o de mostrar el resultado.

    public double pedirPrecio(){
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca precio sin IVA: "));
        return precio;
    }

    public double calcPrecioFinal(){
        double sinIva = pedirPrecio();
        double conIva = sinIva + sinIva*0.21;
        return conIva;
    }

    public void mostrarPrecioFinal(){
        JOptionPane.showMessageDialog(null, "El producto con IVA incluido vale "+calcPrecioFinal());
    }
}
