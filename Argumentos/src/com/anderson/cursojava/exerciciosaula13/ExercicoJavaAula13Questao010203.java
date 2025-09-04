package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicoJavaAula13Questao010203 {
    public static void main(String[] args) {

        System.out.println("Questão 01:");
        System.out.println("Olá mundo");

        System.out.println("Questão 02:");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número solicitado: ");
        int numero = entrada.nextInt();

        System.out.println("O número solicitado foi: " + numero);

        System.out.println("Questão 03:");
        Scanner entrada2 = new Scanner(System.in);

        int numero1, numero2;
        System.out.println("Informe o número 01: ");
        numero1 = entrada2.nextInt();
        System.out.println("Informe o número 02: ");
        numero2 = entrada2.nextInt();
        System.out.println("A soma de " + numero1 + " com " + numero2 + " é " + (numero1 + numero2));


    }
}
