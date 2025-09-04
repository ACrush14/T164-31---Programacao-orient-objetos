package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao06 {
    public static void main(String[] args) {
        double raio;
        double area;

        System.out.println("Digite o valor do Raio: ");
        raio = new Scanner(System.in).nextDouble();

        area = (3.14 * raio * raio);

        System.out.println("O valor da área é " + area);


    }
}
