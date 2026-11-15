package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo();
        ret1.setLargura(10.5);
        ret1.setAltura(5.2);


        System.out.println("--- Testando dimensões inválidas ---");
        ret1.setLargura(-2.0);
        ret1.setAltura(1200.0);

        System.out.println("\n--- Retângulo 1 (toString) ---");
        System.out.println(ret1);
        System.out.printf("Área do Retângulo 1: %.2f%n", ret1.calcularArea());


        System.out.println("\n--- Testando Retângulo com Construtor Parametrizado ---");
        Retangulo ret2 = new Retangulo(15.0, 8.0);
        System.out.println(ret2);
        System.out.printf("Área do Retângulo 2: %.2f%n", ret2.calcularArea());
    }
}