package com.professor.lucas.transicao;

import java.util.Scanner;

public class AlgFund3 {



    public void somar(){
        System.out.println("Quantidade de números:");
        Scanner prompt = new Scanner(System.in);
        byte n = prompt.nextByte();
        int numero;
        long soma = 0;
        byte i = 0;
        while (i < n) {
            i++;
            System.out.println("Número ");
            numero = prompt.nextInt();
            soma = soma + numero;

        }
        System.out.println("Soma = " + soma);
    }
}

