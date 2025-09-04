package com.anderson.cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros; //numero de passageiros
    double capCombustivel; //capacidade de combustivel
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é" + capCombustivel * consumoCombustivel + " km");
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonima foi chamado.");

        return capCombustivel * consumoCombustivel;
    }
}
