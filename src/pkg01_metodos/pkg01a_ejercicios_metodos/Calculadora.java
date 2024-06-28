package pkg01_metodos.pkg01a_ejercicios_metodos;

import javax.swing.*;

public class Calculadora {
    int i = 1;
    private double pedirOperando(){
        i++;
        return Double.parseDouble(JOptionPane.showInputDialog("Introduzca operando "+(i-1)+":"));
    }

    private String pedirOperacion(){
        return JOptionPane.showInputDialog(
                "Qué operación desea realizar??\n" +
                "+: suma\n" +
                "-: resta\n" +
                "*: multiplica\n" +
                "/: divide\n" +
                "%: módulo (resto)");
    }

    private double suma(double op1, double op2){
        return op1+op2;
    }

    private double resta(double op1, double op2){
        return op1-op2;
    }

    private double multiplica(double op1, double op2){
        return op1*op2;
    }

    private double divide(double op1, double op2){
        return op1/op2;
    }

    private int resto(int op1, int op2) {
        return op1%op2;
    }

    private void resolucion(String signo, double op1, double op2){
        switch (signo){
            case "+":
                JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+ suma(op1,op2));
                break;
            case "-":
                JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+ resta(op1,op2));
                break;
            case "*":
                JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+ multiplica(op1,op2));
                break;
            case "/":
                JOptionPane.showMessageDialog(null, op1+" / "+op2+" = "+ divide(op1,op2));
                break;
            case "%":
                JOptionPane.showMessageDialog(null, "Resto de dividir "+op1+" / "+op2+" es "+ resto((int)op1,(int)op2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Datos erróneos, finalizando programa.");
        }
    }

    public void iniciar(){
        double op1 = pedirOperando();
        String signo = pedirOperacion();
        double op2 = pedirOperando();
        resolucion(signo,op1,op2);
    }

}
