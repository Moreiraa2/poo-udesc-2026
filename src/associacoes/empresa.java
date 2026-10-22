package associacoes;

public class empresa {
    private String nome;
    private String endereço;
    private boolean matriz;

    private funcionario diretor;

    public empresa(String nome, String endereço, boolean matriz) {
        this.nome = nome;
        this.endereço = endereço;
        this.matriz = matriz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean isMatriz() {
        return matriz;
    }

    public void setMatriz(boolean matriz) {
        this.matriz = matriz;
    }

    public funcionario getDiretor() {
        return diretor;
    }

    public void setDiretor(funcionario diretor) {
        this.diretor = diretor;


    }
}
