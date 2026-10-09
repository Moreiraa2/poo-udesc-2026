package exercicio1oo.classes;

public class TestaCarro {
    static void main(String[] args) {
        Carro carro=new Carro();

        carro.modelo = "Virtus";
        carro.marca = "VW";
        carro.ano = 2021;
        carro.velocidade= 150;

        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Velocidade: " + carro.velocidade);
    }
}
