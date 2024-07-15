package pkg03_herencia.main;

import pkg03_herencia.vehiculos.automovil.Automovil;
import pkg03_herencia.vehiculos.automovil.coche.Coche;
import pkg03_herencia.vehiculos.automovil.coche.CocheTodoterreno;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        Automovil auto = new Automovil();
        auto.setMarca("Audi");
        auto.setMatricula("3776KZJ");
        System.out.println(auto.getMarca()+" con matrícula "+auto.getMatricula()+"\n");

        Coche coche = new Coche();
        coche.setMarca("Audi");
        coche.setModelo("A3");
        coche.setMatricula("3452SFE");
        System.out.println(coche.getMarca()+" "+coche.getModelo()+" con matrícula "+coche.getMatricula());
        coche.ajustarAsiento();

        CocheTodoterreno todoterreno = new CocheTodoterreno();
        todoterreno.ajustarAsiento();
        todoterreno.activar4x4();

    }
}
