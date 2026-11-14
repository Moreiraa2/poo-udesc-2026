package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(10.5);
        retangulo.setAltura(5.2);

        System.out.printf("Largura: %.2f%n", retangulo.getLargura());
        System.out.printf("Altura: %.2f%n", retangulo.getAltura());

        // Testando o novo método de cálculo de área
        System.out.printf("Área do Retângulo: %.2f%n", retangulo.calcularArea());
    }
}