package com.anderson.cursojava.aula11;

public class VariaveisInteiras {
    public static void main(String[] args) {
        byte idade01 = 10; //1byte
        short idade02 = 20; //2bytes
        int idade03 = 30;  //4 bytes
        long idade04 = 40; //8 bytes
        float idade05 = 50; // 4 bytes, float
        double idade06 = 60; // 8bytes, float
        char idade07 = 70; //caractere ASCII
        char idade08 = 80; //Caractere ASCII

        System.out.println("Valor idade 01: " + idade01);
        System.out.println("Valor idade 02: " + idade02);
        System.out.println("Valor idade 03: " + idade03);
        System.out.println("Valor idade 04: " + idade04);
        System.out.println("Valor idade 05: " + idade05);
        System.out.println("Valor idade 06: " + idade06);
        System.out.println("Valor idade 07: " + idade07);
        System.out.println("Valor idade 08: " + idade08);

        int Oct31 = 031;
        int Dec25 = 25;

        System.out.println(Oct31 == Dec25);

    }
}
