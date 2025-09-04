package com.anderson.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiro = input.nextInt();
        System.out.println("Digite o segundo número:");
        int segundo = input.nextInt();

        if (primeiro > segundo) {
            System.out.println("O maior número é " + primeiro);
        } else if (primeiro < segundo) {
            System.out.println("O maior número é " + segundo);

        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
