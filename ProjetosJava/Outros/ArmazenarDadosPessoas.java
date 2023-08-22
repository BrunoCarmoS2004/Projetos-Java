package ProjetosJava.Outro;

import java.util.ArrayList;

public class ArmazenarDadosPessoas {
    public void info(ArrayList<String>palavras, ArrayList<Integer>numeros){
        for (int i = 0; i < palavras.size(); i++) {
            System.out.printf("O nome da pessoa é %d\n",palavras.get(i));
            System.out.printf("Com o sobre nome %d\n",palavras.get(i+1));
            System.out.printf("De pele %d\n",palavras.get(i+2));
            System.out.printf("Se considerando %d\n",palavras.get(i+3));
            System.out.printf("Com %d de idade\n",palavras.get(i+4));
        }
    }
}
