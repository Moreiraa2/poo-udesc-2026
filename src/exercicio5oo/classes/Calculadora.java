package exercicio5oo.classes;

public class Calculadora {

    private double n1, n2;
    private double resultado;


    public Calculadora() {
    }


    public Calculadora(double n1, double n2, double resultado) {
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
    }

    public double somar() {
        resultado = n1 + n2;
        return resultado;
    }

    public double somar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return somar();
    }

    public double subtrair() {
        resultado = n1 - n2;
        return resultado;
    }

    public double subtrair(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return subtrair();
    }

    public double multiplicar() {
        resultado = n1 * n2;
        return resultado;
    }

    public double multiplicar(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        return multiplicar();
    }

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

    public double mostrarUltimoResultadoCalculado() {
        System.out.println("Resultado atual é: " + resultado);
        return resultado;
    }

    public double getN1() {
        return this.n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return this.n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return this.resultado;
    }

    public String toString() {
        return "Calculadora [N1: " + n1 + ", N2: " + n2 + ", Resultado: " + resultado + "]";
    }
}