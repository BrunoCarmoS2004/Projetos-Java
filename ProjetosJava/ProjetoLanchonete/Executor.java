package ProjetosJava.ProjetoLanchonete;


public class Executor {
    public static void main(String[] args) {
        Lanche [] lanche = new Lanche[5];
        for (int i = 0; i < lanche.length; i++) {
            lanche[i].setNome("Lanche" + (1+1));
            lanche[i].setPreco(i+1);
        }
        Lanchonete lanchonete = new Lanchonete("JK", "Unifil Lanches", 5);
        lanchonete.exibirCardapio();
        
    }
}
