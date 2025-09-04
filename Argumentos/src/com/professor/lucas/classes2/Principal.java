package com.professor.lucas.classes2;

public class Principal {
    public static void main(String[] args) {
        Conta joao = new Conta();
        joao.nome = "Joao";
        joao.saldo = 1000;
        joao.numBanco = 100;
        joao.cpf = "12345678912";
        joao.status = "Funcionando";


        joao.mostrar();

        joao.bonificacao();

        joao.especial();

    }
}
