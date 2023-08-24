package ProjetosJava.ProjetoLanchonete;

public class cliente {
    private int celular;
    private String endereco;
    public cliente(int celular, String endereco) {
        this.celular = celular;
        this.endereco = endereco;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public void fazerPedido(pessoa pessoa, lanche lanche){
        System.out.println("oi");
    }

}
