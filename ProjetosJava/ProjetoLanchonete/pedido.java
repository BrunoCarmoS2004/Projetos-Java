package ProjetosJava.ProjetoLanchonete;


public class Pedido {
    private cliente cliente;
    private Lanche lanche;
    
    public Pedido(cliente cliente, Lanche lanche) {
        this.cliente = cliente;
        this.lanche = lanche;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }
}
