package com.anderson.cursojava.exerciciosaula15;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double primeiro = input.nextDouble();

        if (primeiro > 0) {
            System.out.println("O número é maior que zero");
        } else if (primeiro < 0) {
            System.out.println("O número é menor que zero");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
