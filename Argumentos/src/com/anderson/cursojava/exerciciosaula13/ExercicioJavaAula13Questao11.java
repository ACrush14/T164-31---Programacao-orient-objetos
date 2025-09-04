package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao11 {
    public static void main(String[] args) {
        double a, b, c;
        double calca, calcb, calcc;

        System.out.println("Primeiro número: ");
        a = new Scanner(System.in).nextDouble();
        System.out.println("Segundo número: ");
        b = new Scanner(System.in).nextDouble();
        System.out.println("Terceiro número: ");
        c = new Scanner(System.in).nextDouble();

        calca = ((a *2) + (b / 2));

        calcb = ((a * 3) + c);

        calcc = (c * c * c);

        System.out.println(("A: " + calca + " B: " + calcb + " C: " + calcc));


    }
}
