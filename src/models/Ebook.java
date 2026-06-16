package models;

import interfaces.Livro;

public class Ebook implements Livro {

    @Override
    public void exibirDetalhes() {
        System.out.println("E-book criado.");
    }
}