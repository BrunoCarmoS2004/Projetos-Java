package ProjetosJava.ProjetoLanchonete;

import javax.sound.sampled.SourceDataLine;

public class Executor {
    public static void main(String[] args) {
        lanche [] lanche = new lanche[5];
        for (int i = 0; i < lanche.length; i++) {
            lanche[i].setNome("Lanche" + (1+1));
            lanche[i].setPreco(i+1);
        }
        lanchonete lanchonete = new lanchonete("JK", "Unifil Lanches", 5);
        lanchonete.exibirCardapio();
        
    }
}
