package exercicio2oo.testes;

// Importa a classe Livro que acabámos de corrigir
import exercicio2oo.classes.Livro;

public class TestaLivro {

    public static void main(String[] args) {
        // Criar o objeto livro baseado na classe Livro
        Livro livro = new Livro();


        livro.autor = "Paulo Coelho";
        livro.titulo = "O Alquimista";
        livro.genero = "Ficção";
        livro.emprestado = false;


        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Género: " + livro.genero);
        System.out.println("Emprestado: " + livro.emprestado);
    }
}