package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao09 {
    public static void main(String[] args) {

        double grausf, grausc;


        System.out.println("Quantos graus farenheit");
        grausf = new Scanner(System.in).nextDouble();

        grausc = (5 * (grausf - 32) / 9);

        System.out.println("Quantidade de graus celcius: " + grausc);

    }
}
