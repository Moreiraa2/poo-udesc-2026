package estatico;

public class testautils {
    public static void main(String[] args){
        utils u = new utils();
        System.out.println(utils.PI);
        System.out.println(utils.max(100, 50));
        System.out.println(utils.max(-3, -5));

        System.out.println(Aluno.quantidadealunos);
        Aluno ze = new Aluno();
        System.out.println("qtd.alunos: "+ Aluno.quantidadealunos);
    }
}
