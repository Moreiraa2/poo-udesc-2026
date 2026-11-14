package exercicio4oo.testes;

import exercicio4oo.classes.ContaBancaria;

public class TestaContaBancaria {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("12345-6");
        conta.setTitular("Matheus Moreira");

        conta.depositar(1500.75);
        conta.sacar(500.00);


        System.out.printf("Número da Conta: %s%n", conta.getNumeroConta());
        System.out.printf("Titular: %s%n", conta.getTitular());
        conta.imprimirSaldo();
    }
}