package exercicio3oo.testes;
import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(10.5);
        retangulo.setAltura(5.2);

        System.out.printf("Largura: " + retangulo.getLargura());
        System.out.printf("Altura: " + retangulo.getAltura());
    }
}