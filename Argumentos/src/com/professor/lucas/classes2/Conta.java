package com.professor.lucas.classes2;

public class Conta {

    String nome;
    String cpf;
    short numBanco;
    double saldo;
    String status;


    public void mostrar() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Status: " + status);
        System.out.println("Número do banco: " + numBanco);
    }

    public void bonificacao() {
        var bonificacao = saldo * 1.1;
        saldo =  bonificacao;
        System.out.println("Saldo atual com bonificacao: " + saldo);
    }

    public void especial() {
        if (status == "especial" || status == "Especial") {
            var especial = saldo * 1.10;
            saldo = especial;
            System.out.println("Saldo atual com especial: " + saldo);
        } else {
            var especial = saldo * 1.05;
            saldo = especial;
            System.out.println("Saldo atual sem especial: " + saldo);

        }
    }

}
