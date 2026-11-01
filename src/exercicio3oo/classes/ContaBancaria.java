package exercicio3oo.classes;

public class ContaBancaria {

    private String numeroConta;
    private String titular;
    private double saldo;

    // Getter do número da conta
    public String getNumeroConta() {
        return this.numeroConta;
    }

    // Setter do número da conta
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Getter do titular
    public String getTitular() {
        return this.titular;
    }

    // Setter do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter do saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
}