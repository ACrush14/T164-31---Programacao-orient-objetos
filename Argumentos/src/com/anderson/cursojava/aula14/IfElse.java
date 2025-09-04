package com.anderson.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua idade?");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade, não vá ser preso.");
        } else {
            System.out.println("Não é maior de idade, coisa de yag");
        }

        System.out.println("Entre com o preço do item");
        double preco = scan.nextDouble();
        
        if (preco <= 10) {
            System.out.println("pode comprar, baratíssimo");
        } else if (preco > 10 && preco < 15 ) {
            System.out.println("Peça um desconto");
        } else if (preco > 15 && preco < 20 ) {
            System.out.println("Está caro, pesquise outro lugar");
        } else if (preco > 20) {
            System.out.println("Está muito caro, desista");
        }
    }
}
