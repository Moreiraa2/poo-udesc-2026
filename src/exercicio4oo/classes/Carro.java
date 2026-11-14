package exercicio4oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
    }

    public void imprimirVelocidade() {
        System.out.println("Velocidade atual do " + this.modelo + ": " + this.velocidade + " km/h");
    }
}