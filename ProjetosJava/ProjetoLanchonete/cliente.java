package ProjetosJava.ProjetoLanchonete;

public class cliente extends pessoa{
    private String celular;
    private String endereco;

    public cliente(String nome, String celular, String endereco) {
            super(nome);
            this.celular = celular;
            this.endereco = endereco;
    }

    public String getCelular() {
            return celular;
    }

    public void setCelular(String celular) {
            this.celular = celular;
    }

    public String getEndereco() {
            return endereco;
    }

    public void setEndereco(String endereco) {
            this.endereco = endereco;
    }

    @Override
    public void fazerPedido(pessoa pessoa, lanche lanche) {
            System.out.println("O pedido está sendo feito");
    }
}