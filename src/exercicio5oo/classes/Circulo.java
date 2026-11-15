package exercicio5oo.classes;

public class Circulo {
    private double raio;


    public Circulo() {
    }

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        // Validação: raio entre 0 e 1000 utilizando AND (&&)
        if (raio >= 0 && raio <= 1000) {
            this.raio = raio;
        } else {
            System.out.println("Raio inválido! Deve estar entre 0 e 1000.");
        }
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

    public String toString() {
        return "Circulo [Raio: " + raio + "]";
    }
}