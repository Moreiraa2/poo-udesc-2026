package exercicio4oo.classes;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

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

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque não realizado: saldo insuficiente ou valor inválido!");
        }
    }

    public void imprimirSaldo() {
        System.out.printf("Titular: %s | Saldo atual: R$ %.2f%n", this.titular, this.saldo);
    }
}