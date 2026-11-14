package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        circulo.setRaio(3.5);

        System.out.printf("Raio: %.2f%n", circulo.getRaio());


        System.out.printf("Diâmetro: %.2f%n", circulo.calcularDiametro());
        System.out.printf("Perímetro: %.2f%n", circulo.calcularPerimetro());
        System.out.printf("Área: %.2f%n", circulo.calcularArea());
    }
}