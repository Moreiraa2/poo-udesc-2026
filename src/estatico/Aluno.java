package estatico;

public class Aluno {
    String nome;
    int idade;
    static int quantidadealunos = 0;

    public Aluno() {
        quantidadealunos++;
        System.out.println("Criando o" +
                quantidadealunos + "º Aluno");

    }

}
