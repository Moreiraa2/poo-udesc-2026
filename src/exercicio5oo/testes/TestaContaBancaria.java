package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TestaContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroConta("12345-6");
        conta1.setTitular("Matheus Moreira");


        System.out.println("--- Testando valores inválidos ---");
        conta1.setSaldo(-500.0); // Saldo inválido
        conta1.depositar(-100.0); // Depósito inválido
        conta1.sacar(50.0);       // Saque sem saldo

        conta1.depositar(1500.75);
        conta1.sacar(500.00);

        System.out.println("\n--- Conta 1 (toString) ---");
        System.out.println(conta1);
        conta1.imprimirSaldo();


        System.out.println("\n--- Testando Conta com Construtor Parametrizado ---");
        ContaBancaria conta2 = new ContaBancaria("98765-4", "Ana", 3000.0);
        System.out.println(conta2);
    }
}