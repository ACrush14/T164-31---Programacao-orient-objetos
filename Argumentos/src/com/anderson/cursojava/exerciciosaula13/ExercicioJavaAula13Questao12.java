package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao12 {
    public static void main(String[] args) {
        double altura, peso;

        System.out.println("Me dê a altura em metros");
        altura = new Scanner(System.in).nextDouble();

        peso = ((72.7 * altura) - 58);
        System.out.println("Seu peso ideal é " + peso);

    }
}
