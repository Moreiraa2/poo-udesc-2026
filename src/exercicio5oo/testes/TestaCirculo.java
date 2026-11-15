package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.setRaio(3.5);


        System.out.println("--- Testando raio inválido ---");
        circulo1.setRaio(-5.0);
        circulo1.setRaio(1500.0);

        System.out.println("\n--- Círculo 1 (toString) ---");
        System.out.println(circulo1);
        System.out.printf("Diâmetro: %.2f%n", circulo1.calcularDiametro());
        System.out.printf("Perímetro: %.2f%n", circulo1.calcularPerimetro());
        System.out.printf("Área: %.2f%n", circulo1.calcularArea());


        System.out.println("\n--- Testando Círculo com Construtor Parametrizado ---");
        Circulo circulo2 = new Circulo(10.0);
        System.out.println(circulo2);
        System.out.printf("Área do Círculo 2: %.2f%n", circulo2.calcularArea());
    }
}