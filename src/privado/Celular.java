package privado;

public class Celular {
    private String marca;
    private String modelo;
    private int ano;

    public Celular(){

        this.marca = "";
        this.modelo = "";
        this.ano = 1;
    }
public Celular (String marca, String modelo, int ano){
    this.setMarca(marca);
    this.setAno(ano);
    this.setModelo(modelo);
}

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
