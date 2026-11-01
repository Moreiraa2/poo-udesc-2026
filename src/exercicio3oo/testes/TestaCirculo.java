package exercicio3oo.testes;
import exercicio3oo.classes.Circulo;

public class TestaCirculo {
    static void main(String[] args) {
        Circulo circulo=new Circulo();

        circulo.setRaio(3.5);

        System.out.printf("Raio: "+ circulo.getRaio());
    }
}
