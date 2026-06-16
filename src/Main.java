import factory.LivroFactory;
import interfaces.Livro;

public class Main {

    public static void main(String[] args) {

        Livro livro1 =
            LivroFactory.criarLivro("FISICO");

        Livro livro2 =
            LivroFactory.criarLivro("EBOOK");

        Livro livro3 =
            LivroFactory.criarLivro("AUDIOBOOK");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();
    }
}