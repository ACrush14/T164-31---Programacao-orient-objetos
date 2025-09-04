package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao04 {
    public static void main(String[] args) {

        double b1, b2, b3, b4;
        double media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        b1 = entrada.nextInt();
        System.out.println("Informe a segunda nota: ");
        b2 = entrada.nextInt();
        System.out.println("Informe a terceira nota: ");
        b3 = entrada.nextInt();
        System.out.println("Informe a quarta nota: ");
        b4 = entrada.nextInt();

        media =  (b1 + b2 + b3 + b4) / 4;
        System.out.println("A média é " + media);





    }
}
