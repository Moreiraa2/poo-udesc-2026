package exercicio1oo.classes;

public class TestaContaBancaria {
    static void main(String[] args) {
        ContaBancaria conta=new ContaBancaria();

        conta.numeroConta = "12345-6";
        conta.Titular = "Matheus Moreira";
        conta.saldo = 1500.75;

        System.out.println("Número da Conta: " + conta.numeroConta);
        System.out.println("Titular: " + conta.Titular);
        System.out.println("Saldo: " + conta.saldo);
    }
}
