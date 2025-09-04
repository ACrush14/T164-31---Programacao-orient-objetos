package com.lucas.exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Digite a quantidade de produtos que deseja cadastrar:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Produto produtos [] = new Produto [n];


        for (int i = 0; i < produtos.length; i++){
            System.out.println("Digite o codigo do produto:");
            String codigo = s.next();
            System.out.println("Digite o peso do produto:");
            float peso = s.nextFloat();
            System.out.println("Digite o valor do produto");
            float valor = s.nextFloat();
            Produto p = new Produto(codigo,peso,valor);
            produtos[i] = p;
        }

        int cont = 0;
        for (int i =  0; i < produtos.length; i++) {
            if (produtos[i].getPeso() > 10 && produtos[i].getValor() < 50){
                cont++;
            }
        }
        System.out.println("A quantidade de produtos com peso mairo que 10 e valor menos que 50 é " + cont);
    }


}
