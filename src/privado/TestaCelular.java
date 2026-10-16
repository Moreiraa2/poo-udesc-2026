package privado;

public class TestaCelular {
    public static void main(String[] args) {

        Celular meuCelular = new Celular();


        meuCelular.setMarca("Motorola");
        meuCelular.setModelo("V3");
        meuCelular.setAno(2000);

        System.out.println("Marca do celular: " + meuCelular.getMarca());
        System.out.println("Modelo do celular: " + meuCelular.getModelo());
        System.out.println("Ano de lançamento: " + meuCelular.getAno());
    }
}