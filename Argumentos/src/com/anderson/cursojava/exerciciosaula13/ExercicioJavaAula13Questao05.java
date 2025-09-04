package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao05 {
    public static void main(String[] args) {

        double mt, cm;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos metros?");
        mt = entrada.nextDouble();

        cm = (mt * 100);
        System.out.println("Isso em centímetros dá " + cm);
    }
}
