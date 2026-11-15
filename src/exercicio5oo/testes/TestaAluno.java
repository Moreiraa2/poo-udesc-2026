package exercicio5oo.testes;

import exercicio5oo.classes.Aluno;

public class TestaAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Matheus");
        aluno1.setIdade(31);
        aluno1.setMatricula("2026001");
        aluno1.setNota1(8.0);
        aluno1.setNota2(6.5);


        System.out.println("--- Testando validação de notas inválidas ---");
        aluno1.setNota1(12.0);
        aluno1.setNota2(-2.0);

        System.out.println("\n--- Testando toString() e Situação ---");
        System.out.println(aluno1);
        aluno1.imprimirSituacao();


        System.out.println("\n--- Testando Aluno com Construtor Parametrizado ---");
        Aluno aluno2 = new Aluno("Ana", 28, "2026002", 9.0, 7.5);
        System.out.println(aluno2);
        aluno2.imprimirSituacao();
    }
}