package com.anderson.cursojava.exerciciosaula13;

public class ExercicioJavaAula13Questao15 {
    public static void main(String[] args) {
        double sal, inss, imposto, sindi, hora, nhora, salliq;

        System.out.println("Quanto você ganha por hora?");
        hora = Double.parseDouble(System.console().readLine());
        System.out.println("Quantas horas você trabalha por mês");
        nhora = Double.parseDouble(System.console().readLine());

        sal = hora * nhora;

        System.out.println("seu salário é " + sal);

        inss = sal*0.08;
        System.out.println("Você pagou ao INSS " + inss);

        sindi = sal*0.05;
        System.out.println("Você pagou ao sindicato " + sindi);

        imposto = sal * 0.11;
        System.out.println("Você pagou de imposto " + imposto);

        salliq = sal - (imposto + sindi + inss);

        System.out.println("Seu salário líquido é " + salliq);




    }
}
