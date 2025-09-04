package com.lucas.exercicio2;

public class Conta {

    String cpf;
    short numBanco;
    float saldo;

    public float bonificacao() {
        return saldo * 0.1f;
    }

    public void sacar(float valorSaque) {
        saldo -=  valorSaque;
    }

    public void depositar(float valorDeposito){
        saldo += valorDeposito;
    }

    public void mostrar(){
        System.out.println("O seu CPF é " + cpf);
        System.out.println("Seu numero de banco é " + numBanco);
        System.out.println("O seu saldo é " + saldo);
    }

    public String toString(){
        return "Conta - CPF: " + cpf + ", número do banco" + numBanco + " e saldo: " + saldo;
    }
}
