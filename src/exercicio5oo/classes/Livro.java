package exercicio5oo.classes;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private boolean emprestado;


    public Livro() {
    }


    public Livro(String titulo, String autor, String genero, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void emprestar() {

        if (!this.emprestado) {
            this.emprestado = true;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já se encontra emprestado.");
        }
    }

    public void devolver() {

        if (this.emprestado) {
            this.emprestado = false;
            System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O livro '" + this.titulo + "' já está na biblioteca.");
        }
    }

    public boolean verificarDisponibilidade() {
        return !this.emprestado;
    }

    public String toString() {
        return "Livro [Título: " + titulo + ", Autor: " + autor + ", Gênero: " + genero
                + ", Emprestado: " + (emprestado ? "Sim" : "Não") + "]";
    }
}