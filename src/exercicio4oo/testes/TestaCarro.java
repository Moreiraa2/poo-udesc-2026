package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Virtus");
        carro.setMarca("VW");
        carro.setAno(2021);
        carro.setVelocidade(50.0);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());


        carro.acelerar(); // 60
        carro.acelerar(); // 70
        carro.imprimirVelocidade();

        carro.frear();    // 60
        carro.imprimirVelocidade();
    }
}