package exercicio5oo.testes;

import exercicio5oo.classes.Livro;

public class TestaLivro {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setAutor("Paulo Coelho");
        livro1.setTitulo("O Alquimista");
        livro1.setGenero("Ficção");
        livro1.setEmprestado(false);

        System.out.println("--- Livro 1 (toString) ---");
        System.out.println(livro1);
        System.out.println("Disponível inicialmente? " + livro1.verificarDisponibilidade());

        livro1.emprestar();
        System.out.println("Tentando emprestar novamente:");
        livro1.emprestar();

        livro1.devolver();
        System.out.println("Tentando devolver novamente:");
        livro1.devolver();


        System.out.println("\n--- Testando Livro com Construtor Parametrizado ---");
        Livro livro2 = new Livro("1984", "George Orwell", "Distopia", false);
        System.out.println(livro2);
        livro2.emprestar();
        System.out.println(livro2);
    }
}