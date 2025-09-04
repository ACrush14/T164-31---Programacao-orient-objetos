package com.anderson.cursojava.exerciciosaula24;

public class Exer06 {
    public static void main(String[] args) {

        Contato contato1 = new  Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "111-111-111";
        contato1.telefones[1] = "222-222-222";
        contato1.telefones[2] = "333-333-333";
        contato1.telefones[3] = "444-444-444";
        contato1.telefones[4] = "555-555-555";
    }
}
