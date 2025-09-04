package com.anderson.cursojava.exerciciosaula13;

import java.util.Scanner;

public class ExercicioJavaAula13Questao14 {
    public static void main(String[] args) {

        //criar a variavel peso, excesso e multa
        double peso, exc, multa;
        exc = 0;
        multa = 0;

        //receber input do peso
        System.out.println("Peso total de peixes, em kg:");
        peso = new Scanner(System.in).nextDouble();



        //fazer o calculo do excesso e da multa
        if (peso > 50) {
            //calcular apenas o excesso do peso
            exc = peso - 50;
            multa = exc * 4;
            System.out.println("Multa em reais: " + multa);
        } else {
            System.out.println("O peso está dentro do limite permitido");
        }


        //adicionar valor de multa zero se não ultrapassar
    }
}
