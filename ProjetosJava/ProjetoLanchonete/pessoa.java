package ProjetosJava.ProjetoLanchonete;

public abstract class pessoa {
    private String nome;

    public pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void fazerPedido(pessoa pessoa, lanche lanche);
}