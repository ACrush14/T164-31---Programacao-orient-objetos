package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao07 {
    public static void main(String[] args) {

        double aread, areaq, altura, comp;
        System.out.println("Digite o valor da altura");
        altura = new Scanner(System.in).nextDouble();
        System.out.println("Digite o valor do comprimento");
        comp = new Scanner(System.in).nextDouble();

        areaq = (altura * comp);
        aread = areaq * areaq;

        System.out.println("A área é " + areaq + " e o seu dobro é " + aread);
    }
}
