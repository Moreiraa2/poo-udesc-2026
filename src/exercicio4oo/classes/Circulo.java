package exercicio4oo.classes;

public class Circulo {
    private double raio;

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * this.raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}