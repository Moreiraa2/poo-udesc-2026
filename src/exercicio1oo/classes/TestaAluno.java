package exercicio1oo.classes;

import java.sql.SQLOutput;

public class TestaAluno {
    static void main(String[] args) {
        Aluno Matheus = new Aluno();
        Matheus.matricula ="123";
        Matheus.nome ="Matheus";
        Matheus.idade = 32;
        Matheus.nota1 = 5;
        Matheus.nota2 = 6;
        Matheus.nota3 = 7;
        Matheus.nota4 = 8;
        System.out.println("Matricula: " + Matheus.matricula);
        System.out.println("Nome: "+ Matheus.nome);
        System.out.println("idade"+ Matheus.idade);
        System.out.println("nota"+ Matheus.nota1);
        System.out.println("nota"+ Matheus.nota2);
        System.out.println("nota"+ Matheus.nota3);
        System.out.println("nota"+ Matheus.nota4);
    }
}
