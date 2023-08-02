package ProjetosJava.Outro;

import java.util.ArrayList;

public class ArmazenarDadosPessoas {
    public void info(ArrayList<String>palavras, ArrayList<Integer>numeros){
        for (int i = 0; i < palavras.size(); i++) {
            System.out.printf("O nome da pessoa é %d",i-1);
        }
    }
}
