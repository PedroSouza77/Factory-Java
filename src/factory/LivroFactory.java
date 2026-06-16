package factory;

import interfaces.Livro;
import models.Audiobook;
import models.Ebook;
import models.LivroFisico;

public class LivroFactory {

    public static Livro criarLivro(String tipo) {

        switch (tipo.toUpperCase()) {

            case "FISICO":
                return new LivroFisico();

            case "EBOOK":
                return new Ebook();

            case "AUDIOBOOK":
                return new Audiobook();

            default:
                throw new IllegalArgumentException(
                    "Tipo de livro inválido."
                );
        }
    }
}