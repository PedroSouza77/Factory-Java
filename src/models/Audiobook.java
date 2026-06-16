package models;

import interfaces.Livro;

public class Audiobook implements Livro {

    @Override
    public void exibirDetalhes() {
        System.out.println("Audiobook criado.");
    }
}