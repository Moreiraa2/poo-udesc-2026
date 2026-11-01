package exercicio3oo.testes;
import exercicio3oo.classes.Livro;


public class TestaLivro {

    public static void main(String[] args) {
        // Criar o objeto livro baseado na classe Livro
        Livro livro = new Livro();


        livro.setAutor("Paulo Coelho");
        livro.setTitulo("O Alquimista");
        livro.setGenero("Ficção");
        livro.setEmprestado (false);


        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Género: " + livro.getGenero());
        System.out.println("Emprestado: " + livro.isEmprestado());
    }
}