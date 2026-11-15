package exercicio5oo.classes;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;


    public ContaBancaria() {
    }


    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        setSaldo(saldo);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        // Validação: saldo só aceita valores positivos
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido! Deve ser um valor positivo.");
        }
    }

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido! Deve ser positivo.");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque não realizado: valor inválido (não positivo) ou saldo insuficiente!");
        }
    }

    public void imprimirSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f%n", this.titular, this.saldo);
    }

    public String toString() {
        return "ContaBancaria [Número da Conta: " + numeroConta + ", Titular: " + titular
                + ", Saldo: R$ " + String.format("%.2f", saldo) + "]";
    }
}