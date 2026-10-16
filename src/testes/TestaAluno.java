package testes;

import dominio.Aluno;

public class TestaAluno {
    static void main(String[] args) {
        Aluno ze = new Aluno();
        ze.nome = "Zé da silva";
        ze.idade = 20;
        System.out.printf("%s tem %d anos \n",
                ze.nome,
                ze.idade);
    }
}
