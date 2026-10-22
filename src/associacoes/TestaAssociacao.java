package associacoes;

public class TestaAssociacao {
    static void main(String[] args) {
        funcionario mayco = new funcionario(
                "Mayco Nunes",
                 "Prof . Dr.");
        System.out.println( mayco.nomeCompleto ());
        System.out.println(mayco);

        empresa cesmo = new empresa (
                "Cesmo", "D.E.R",false);

        cesmo.setDiretor(mayco);
        System.out.println( "Diretor do cesmo:" + cesmo.getDiretor().nomeCompleto());


    }
}
