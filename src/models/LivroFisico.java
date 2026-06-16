package models;

import interfaces.Livro;

public class LivroFisico implements Livro {

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro Físico criado.");
    }
}