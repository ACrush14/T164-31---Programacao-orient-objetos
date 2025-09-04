package com.anderson.cursojava.aula25;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros; //numero de passageiros
    double capCombustivel; //capacidade de combustivel
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("Autonomia do Carro é " + capCombustivel * consumoCombustivel + " km");
    }
}
