package com.lucas.exercicio3;

public class Produto {

    private String codigo;
    private float peso;
    private float valor;


    public Produto(String codigo, float peso, float valor){
        this.codigo = codigo;
        this.peso = peso;
        this.valor = valor;
    }


    public String toString(){
        return "Produto - codigo: " + codigo + ", peso: " + peso + ", valor: " + valor;
    }
}


