package exercicio3oo.testes;
import exercicio3oo.classes.Carro;

public class TestaCarro {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Virtus");
        carro.setMarca("VW");
        carro.setAno(2021);
        carro.setVelocidade(150);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Velocidade: " + carro.getVelocidade());
    }
}
