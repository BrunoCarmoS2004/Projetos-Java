package ProjetosJava.ProjetoLanchonete;

public class Lanchonete {
    private String local;
    private String nome;
    private Lanche [] cardapio;

    public Lanchonete(String local, String nome, Lanche [] cardapio) {
        this.local = local;
        this.nome = nome;
        this.cardapio = cardapio;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lanche [] getCardapio() {
        return cardapio;
    }

    public void setCardapio(Lanche[] cardapio) {
        this.cardapio = cardapio;
    }

    public void exibirCardapio() {
        if(this.cardapio[0] != null) {
            System.out.println("====== CARDAPIO =====");
            for (int i = 0; i < this.cardapio.length; i++) {
                System.out.print((i+1) + this.cardapio[i].getNome());
                System.out.println((i+1) + " - " + this.cardapio[i].getPreco());
            }
        } else {
            System.out.println("Não há lanches no cardápio.");
        }

//        System.out.print(cardapio.getNome());
//        System.out.println(" - " + cardapio.getPreco());
//        System.out.println("===============");
    }
}
