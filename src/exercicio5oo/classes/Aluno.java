package exercicio5oo.classes;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private double nota1;
    private double nota2;


    public Aluno() {
    }


    public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        setNota1(nota1);
        setNota2(nota2);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota1(double nota1) {
        // Validação: notas entre 0 e 10 utilizando AND (&&)
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota 1 inválida! Deve estar entre 0 e 10.");
        }
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota2(double nota2) {
        // Validação: notas entre 0 e 10 utilizando AND (&&)
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota 2 inválida! Deve estar entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    public void imprimirSituacao() {
        double media = calcularMedia();
        System.out.printf("Média do aluno %s: %.2f%n", this.nome, media);
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    public String toString() {
        return "Aluno [Nome: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula
                + ", Nota 1: " + nota1 + ", Nota 2: " + nota2 + "]";
    }
}