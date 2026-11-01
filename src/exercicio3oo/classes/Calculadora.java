package exercicio3oo.classes;

public class Calculadora {

    private double n1, n2;
    private double resultado;

    // Somar
    public double somar() {
        resultado = n1 + n2;
        return resultado;
    }

    public double somar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return somar();
    }

    // Subtrair
    public double subtrair() {
        resultado = n1 - n2;
        return resultado;
    }

    public double subtrair(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return subtrair();
    }

    // Multiplicar
    public double multiplicar() {
        resultado = n1 * n2;
        return resultado;
    }

    public double multiplicar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return multiplicar();
    }

    // Dividir
    public double dividir() {
        if (n2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }

        resultado = n1 / n2;
        return resultado;
    }

    public double dividir(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return dividir();
    }

    // Mostrar último resultado
    public double mostrarUltimoResultadoCalculado() {
        System.out.println("Resultado atual é: " + resultado);
        return resultado;
    }

    // Getter e Setter de N1
    public double getN1() {
        return this.n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    // Getter e Setter de N2
    public double getN2() {
        return this.n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    // Getter do resultado
    public double getResultado() {
        return this.resultado;
    }
}