package privado;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario fulano = new Funcionario (
                "Fulano da silva",
                25,
                1234.56
        );

       /* fulano.setNome("Fulano da silva");
        fulano.setIdade(25);
        fulano.setSalario(1234.56);*/

        System.out.println("nome: " + fulano.getNome());
        System.out.println("idade:" + fulano.getIdade());
        System.out.println("salario:"+ fulano.getSalario());
    }
}