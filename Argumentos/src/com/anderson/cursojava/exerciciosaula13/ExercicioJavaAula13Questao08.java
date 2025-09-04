package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao08 {
    public static void main(String[] args) {

        double salario, hora, ganhoh;
        System.out.println("Quanto você ganha por hora?");
        ganhoh = new Scanner(System.in).nextDouble();
        System.out.println("Quantas horas você trabalhou?");
        hora = new Scanner(System.in).nextDouble();

        salario = hora * ganhoh;
        System.out.println("Seu salário é " + salario);
    }
}
