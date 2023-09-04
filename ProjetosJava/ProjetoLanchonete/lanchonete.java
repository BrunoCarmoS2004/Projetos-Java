package ProjetosJava.ProjetoLanchonete;

public class Lanchonete {
   private String local;
   private String nome;
   private Lanche [] cardapio;
   
    public Lanchonete(String local, String nome, Lanche[] cardapio) {
        this.local = local;
        this.nome = nome;
        this.cardapio = cardapio;
    }
    public Lanchonete(String local, Lanche[] cardapio) {
        this.local = local;
        this.cardapio = cardapio;
    }
    public Lanchonete(String local,String nome, int capacidade) {
        this.local = local;
        this.nome = nome;
        this.cardapio = new Lanche[capacidade];
    } 

    public void exibirCardapio(){
        System.out.println("======CARDAPIO======");
        for (int i = 0; i < this.cardapio.length; i++) {
            System.out.print(this.cardapio[i].getNome());
            System.out.println(" - "+this.cardapio[i].getPreco());
        }
        System.out.println("====================");
    }

}
