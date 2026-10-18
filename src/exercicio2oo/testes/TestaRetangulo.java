package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.largura = 10.5;
        retangulo.altura = 5.2;

        System.out.println("Largura: " + retangulo.largura);
        System.out.println("Altura: " + retangulo.altura);
    }
}