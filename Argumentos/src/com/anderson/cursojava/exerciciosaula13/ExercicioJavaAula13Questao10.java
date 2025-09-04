package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao10 {
    public static void main(String[] args) {
        double grausf, grausc;


        System.out.println("Quantos graus celcius?");
        grausc = new Scanner(System.in).nextDouble();

        grausf = ((grausc * 9/5) +32);

        System.out.println("Quantidade de graus celcius: " + grausf);

    }
}
