package pkg02_matrices.pkg02e_ejercicios;

public class Ej07_RelacionArrays {
    public static void main(String[] args) {

/*
    7) Definimos 3 arrrays de tamaño 4:
       El primero se llamará "nombres", será de tipo String
       El segundo se llamará edad, será de tipo int
       El tercero se llamará sexo, será de tipo char
       Mostar por consola los datos de los 3 arrays que coincidan.
       Por ejemplo Victor, 30, H.
*/

        String[] nombres = {"Laura", "Ziri", "Ángela", "Erik"};
        int[] edad = {38, 8, 18, 17};
        char[] sexo = {'M','M','M','H'};
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]+", "+edad[i]+"años, "+((sexo[i] == 'M')?"Mujer":"Hombre")+".");
        }

    }
}
