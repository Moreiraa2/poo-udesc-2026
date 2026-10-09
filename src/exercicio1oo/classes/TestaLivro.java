package exercicio1oo.classes;

public class TestaLivro {
    static void main(String[] args) {
        Livro livro = new Livro();

        livro.Autor = "Paulo Coelho";
        livro.Titulo= " O Alquimista";
        livro.Genero= "Ficção";
        livro.Emprestado = false;

        System.out.println("Título: " + livro.Titulo);
        System.out.println("Autor: " + livro.Autor);
        System.out.println("Género: " + livro.Genero);
        System.out.println("Emprestado: " + livro.Emprestado);

    }
}
