package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setModelo("Virtus");
        carro1.setMarca("VW");
        carro1.setAno(2021);
        carro1.setVelocidade(50.0);


        System.out.println("--- Testando velocidades inválidas ---");
        carro1.setVelocidade(-10.0); // Inválida
        carro1.setVelocidade(350.0); // Inválida

        System.out.println("\n--- Carro 1 (toString) ---");
        System.out.println(carro1);

        carro1.acelerar();
        carro1.acelerar();
        carro1.imprimirVelocidade();

        carro1.frear();
        carro1.imprimirVelocidade();


        System.out.println("\n--- Testando Carro com Construtor Parametrizado ---");
        Carro carro2 = new Carro("Corolla", "Toyota", 2023, 120.0);
        System.out.println(carro2);
    }
}