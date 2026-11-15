package exercicio5oo.classes;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo() {
    }


    public Retangulo(double largura, double altura) {
        setLargura(largura);
        setAltura(altura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {

        if (largura < 0 || largura > 1000) {
            System.out.println("Largura inválida! Deve estar entre 0 e 1000.");
        } else {
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {

        if (altura < 0 || altura > 1000) {
            System.out.println("Altura inválida! Deve estar entre 0 e 1000.");
        } else {
            this.altura = altura;
        }
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

    public String toString() {
        return "Retangulo [Largura: " + largura + ", Altura: " + altura + "]";
    }
}