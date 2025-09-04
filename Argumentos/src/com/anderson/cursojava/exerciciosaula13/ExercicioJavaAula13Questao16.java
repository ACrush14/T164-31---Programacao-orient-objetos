package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao16 {
    public static void main(String[] args) {


        System.out.println("16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros " +
                "quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros " +
                "quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a " +
                "quantidades de latas de tinta a serem compradas e o preço total.\n");

        // 1 litro de tinta = 3 metros quadrados
        //54 = uma lata = 18 litros = 80 reais

        double metros, litro, lata, preco;
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos metros quadrados você vai pintar?");
        metros = input.nextDouble();

        litro = metros / 3;
        lata = (int) Math.ceil(litro / 18.0);

        preco = lata * 80;

        System.out.println("Quantidade de latas: " + lata);
        System.out.printf("Preço total: R$ %.2f\n", preco);


    }
}
