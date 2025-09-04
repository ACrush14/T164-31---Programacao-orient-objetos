package com.anderson.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        /*System.out.println("Digite seu nome: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: " );
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primeiro nome é: " + primeiroNome   );

        System.out.println("Digite a sua idade: " );
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua altura: " );
        float altura = scan.nextFloat();
        System.out.println("A sua altura é " + altura);*/

        System.out.println("Digite o primeiro nome, idade, quantidade de filhos, altura e se tem animal de estimação:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        int qtdFilhos = scan.nextInt();
        double altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitous os seguintes valores:");
        System.out.println("Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("tem animal: " + temPet);




    }
}


