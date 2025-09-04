package com.professor.lucas.transicao;

import java.util.Scanner;

public class AlgFund4 {



    public void fatorial() {
        System.out.println(("Numero:"));
        Scanner prompt = new Scanner(System.in);
        byte n = prompt.nextByte();
        long fator = 1;
        byte i;
        for (i = 1; i <= n; i++);{
            fator = i * fator;
        }
        System.out.println("Número do fatorial: " + fator);


    }
}
