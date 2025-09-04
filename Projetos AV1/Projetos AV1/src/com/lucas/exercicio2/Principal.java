package com.lucas.exercicio2;

public class Principal {
    public static void main(String[] args) {

        Conta c = new Conta();
        c.cpf = "98545615237";
        c.numBanco = 456;
        c.saldo = 4125.56f;
 //       c.mostrar();
        System.out.println(c);
    }
}
