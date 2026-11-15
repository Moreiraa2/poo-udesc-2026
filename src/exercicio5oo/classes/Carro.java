package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;


    public Carro() {
    }

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        setVelocidade(velocidade);
    }

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
        // Validação: limitar entre 0 e 300. Se estiver fora (usando OR ||), rejeita ou ajusta.
        if (velocidade < 0 || velocidade > 300) {
            System.out.println("Velocidade inválida! Deve estar entre 0 e 300 km/h.");
        } else {
            this.velocidade = velocidade;
        }
    }

    public void acelerar() {
        if (this.velocidade + 10 <= 300) {
            this.velocidade += 10;
        } else {
            this.velocidade = 300;
        }
    }

    public void frear() {
        if (this.velocidade - 10 >= 0) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
    }

    public void imprimirVelocidade() {
        System.out.println("Velocidade atual do " + this.modelo + ": " + this.velocidade + " km/h");
    }

    public String toString() {
        return "Carro [Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano
                + ", Velocidade: " + velocidade + " km/h]";
    }
}