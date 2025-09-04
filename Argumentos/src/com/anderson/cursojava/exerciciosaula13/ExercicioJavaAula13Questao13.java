package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao13 {
    public static void main(String[] args) {
        double altura, pesoIdeal, pesoAtual;
        char sexo;

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Qual seu sexo? Digite h para homem ou m para mulher");
        sexo = entrada.next().toLowerCase().charAt(0);

        System.out.println("Sua altura em metros");
        altura = entrada.nextDouble();

        System.out.println("Seu peso em kg");
        pesoAtual = entrada.nextDouble();

        if (sexo == 'h') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'm') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido");
            entrada.close();
            return; // encerra o programa
        }

        // fora do if/else
        System.out.printf("Seu peso ideal é %.2f kg\n", pesoIdeal);

        if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal");
        } else if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso ideal");
        } else {
            System.out.println("Você está exatamente no peso ideal");
        }

        entrada.close();
    }
}
