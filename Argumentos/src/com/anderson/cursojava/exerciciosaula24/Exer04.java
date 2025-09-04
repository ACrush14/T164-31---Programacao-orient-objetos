package com.anderson.cursojava.exerciciosaula24;

import java.util.Date;

public class Exer04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro  = new LivroDeBiblioteca();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoPessoa ="Loiane";
    }
}
