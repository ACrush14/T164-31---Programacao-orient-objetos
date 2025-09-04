package com.lucas.exercicio1;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private String cpf;
    private short anoNasc;
    private float altura;

    public Pessoa(String nome, String cpf, short anoNasc, float altura){
        this.nome = nome;
        this.cpf = cpf;
        this.anoNasc = anoNasc;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
        }

    public void setCpf(String cpf){
        this.cpf = cpf;

    }

    public short getAnoNasc(){
        return anoNasc;
    }

    public void setAnoNasc (short anoNasc){
        this.anoNasc = anoNasc;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void mostrar(){
        System.out.println("O nome da pessoa é " + nome);
        System.out.println("O cpf da pessoa é " + cpf);
        System.out.println("O ano de nascimento da pessoa é " + anoNasc);
        System.out.println("A altura da pessoa é " + altura);
    }

    public void mostrar2(){
        System.out.println(this);
    }


    public String toString(){
        return "Pessoa = nome: " + nome + ", CPF: " + cpf + ", Ano de Nascimento: " + anoNasc + ", altura: " + altura;
    }

    public byte calcularIdade(){
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        return (byte) (anoAtual - anoNasc);
    }
}

