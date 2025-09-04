package com.professor.lucas.classes1;

public class Pessoa {

    String nome;
    short anoNascimento;
    String cpf;
    byte idade;
    String sexo;
    short altura;
    short peso;

    public void mostra() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    // Criar método de IMC
    public void calcularIMC() {
        double alturaMetros = altura / 100;
        double imc = peso / (alturaMetros * alturaMetros);
        System.out.println("IMC: " + imc);
    }


    // Criar método de Idade
    public void setIdade() {
        this.idade = (byte) (2025 - anoNascimento);
        System.out.println("Idade: " + idade);

    }

    // Criar método de Quantidade de Água
    public void calcularAgua() {
        double agua = peso * 35;
        System.out.println("Agua: " + agua + " em ml");
    }
}
