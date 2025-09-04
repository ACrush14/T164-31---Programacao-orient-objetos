package com.anderson.cursojava.exerciciosaula24;

public class Exer01 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garatiaMeses = 36;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";


        lampada.tipos = new String [5];
        lampada.tipos [0] = "Abajur";
        lampada.tipos [1] = "Lampeões";
    }
}
