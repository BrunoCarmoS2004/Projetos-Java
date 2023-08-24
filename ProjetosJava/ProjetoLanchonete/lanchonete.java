package ProjetosJava.ProjetoLanchonete;

public class lanchonete {
   private String local;
   private String nome;
   private lanche [] cardapio;
   
    public lanchonete(String local, String nome, lanche[] cardapio) {
        this.local = local;
        this.nome = nome;
        this.cardapio = cardapio;
    }
    public lanchonete(String local, lanche[] cardapio) {
        this.local = local;
        this.cardapio = cardapio;
    }
    public lanchonete(String local,String nome, int capacidade) {
        this.local = local;
        this.nome = nome;
        this.cardapio = new lanche[capacidade];
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
