package com.anderson.cursojava.aula25;

import com.anderson.cursojava.aula25.Carro;

public class TesteCarro {
    public static void main(String[] args) {

                com.anderson.cursojava.aula25.Carro van = new com.anderson.cursojava.aula25.Carro();
                van.marca = "Fiat";
                van.modelo = "Ducato";
                van.numPassageiros = 10;
                van.capCombustivel = 100;
                van.consumoCombustivel = 0.2;

                System.out.println(van.marca);
                System.out.println(van.modelo);

                com.anderson.cursojava.aula25.Carro fusca = new Carro();
                fusca.marca = "Volkswagen";
                fusca.modelo = "Fusca";
                fusca.numPassageiros = 4;
                fusca.capCombustivel = 30;
                fusca.consumoCombustivel = 0.15;

                System.out.println(fusca.marca);
                System.out.println(fusca.modelo);

            }

}
