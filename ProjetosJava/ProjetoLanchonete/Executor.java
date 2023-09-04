package ProjetosJava.ProjetoLanchonete;


public class Executor {
    public static void main(String[] args) {
        Lanche [] lanches = new Lanche[5];
        Lanche [] lanches2 = new Lanche[5];
        //preenchendo vetor de Lanche
        lanches[0] = new Lanche("X-egg", 25.0);
        lanches[1] = new Lanche("X-Salada", 23.0);
        lanches[2] = new Lanche("X-Bacon", 26.0);
        lanches[3] = new Lanche("X-Bacon Frango", 29.0);
        lanches[4] = new Lanche("X-Tudo", 35.0);


        Lanche lanche = new Lanche("X-burger", 25.0);
        Lanchonete lanchonete = new Lanchonete("JK", "UniFil Lanches", lanches2);
        lanchonete.exibirCardapio();
        System.out.println(lanchonete.getLocal());

        //Gerando um pedido
        Cliente cliente = new Cliente("Ricardo", "123456", "Av. JK");
        Pedido pedido = new Pedido(cliente,lanche);
        pedido.info();
    }
}
