import exercicio3oo.classes.ContaBancaria;

public class TestaContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        // Definir os dados utilizando setters
        conta.setNumeroConta("12345-6");
        conta.setTitular("Matheus Moreira");

        // Adicionar saldo utilizando depositar()
        conta.depositar(1500.75);

        // Consultar os dados utilizando getters
        System.out.printf("Número da Conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
    }
}