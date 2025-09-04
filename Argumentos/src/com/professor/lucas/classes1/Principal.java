package com.professor.lucas.classes1;

public class Principal {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.nome = "Joao";
        joao.anoNascimento = 1990;
        joao.cpf = "123456789";
        joao.altura = 170;
        joao.peso = 85;
        joao.sexo = "M";


        joao.mostra();


        joao.calcularIMC();

        joao.calcularAgua();

        joao.setIdade();
    }
}


