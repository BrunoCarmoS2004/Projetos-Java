package ProjetosJava.ProjetoLanchonete;


public class pedido {
    private cliente cliente;
    private lanche lanche;
    
    public pedido(cliente cliente, lanche lanche) {
        this.cliente = cliente;
        this.lanche = lanche;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public lanche getLanche() {
        return lanche;
    }

    public void setLanche(lanche lanche) {
        this.lanche = lanche;
    }
}
