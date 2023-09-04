package ProjetosJava.ProjetoLanchonete;


public class Pedido {
    private Cliente cliente;
    private Lanche lanche;

    public Pedido(Cliente cliente, Lanche lanche) {
        this.cliente = cliente;
        this.lanche = lanche;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }
    public void info(){
        System.out.println(cliente);
        System.out.println(lanche);
    }
}
