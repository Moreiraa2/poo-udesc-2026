package exercicio4oo.testes;

import exercicio4oo.classes.Livro;

public class TestaLivro {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAutor("Paulo Coelho");
        livro.setTitulo("O Alquimista");
        livro.setGenero("Ficção");
        livro.setEmprestado(false);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Gênero: " + livro.getGenero());


        System.out.println("Disponível inicialmente? " + livro.verificarDisponibilidade());

        livro.emprestar();
        System.out.println("Disponível após empréstimo? " + livro.verificarDisponibilidade());

        livro.devolver();
        System.out.println("Disponível após devolução? " + livro.verificarDisponibilidade());
    }
}