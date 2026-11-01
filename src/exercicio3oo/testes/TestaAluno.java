package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Matheus");
        aluno.setIdade(25);
        aluno.setMatricula("2026001");

        System.out.printf("Nome: %s%n", aluno.getNome());
        System.out.printf("Idade: %d anos%n", aluno.getIdade());
        System.out.printf("Matrícula: %s%n", aluno.getMatricula());
    }
}