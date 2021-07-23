package main;

import classes.CalculadoraImc;
import classes.Paciente;

public class Executar {

    public static void main(String[] args) {

        Paciente p1 = new Paciente(1.52,76);
        Paciente p2 = new Paciente(1.67,46);
        Paciente p3 = new Paciente(1.97,110);

        System.out.println(CalculadoraImc.diagnostico(p1));
        System.out.println(CalculadoraImc.diagnostico(p2));
        System.out.println(CalculadoraImc.diagnostico(p3));
    }
}
