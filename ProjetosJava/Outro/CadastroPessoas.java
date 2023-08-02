package ProjetosJava.Outro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        ArmazenarDadosPessoas armazen = new ArmazenarDadosPessoas();
        ArrayList<String>palavras = new ArrayList<>();
        ArrayList<Integer>numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String sobreN = "";
        String cor = "";
        String sexo = "";
        int idade = 0;
        int num = 1;
        System.out.println("Se quiser finalizar digite apenas 0");
        while (num != 3){
            
           
                System.out.print("Escreva o nome da pessoa: ");
                nome = scanner.next();
                palavras.add(nome);      
                
            
                System.out.print("Agora o SOBRE NOME da pessoa: ");
                sobreN = scanner.next();
                palavras.add(sobreN);      
            
            
                System.out.print("Escreva a cor da pessoa: ");
                cor = scanner.next();
                palavras.add(cor);      
     
          
                System.out.print("Escreva o sexo/genrero da pessoa: ");
                sexo = scanner.next();
                palavras.add(sexo);      
 
           
                System.out.print("Escreva a idade da pessoa: ");
                idade = scanner.nextInt();
                numeros.add(idade);      
                num++;  
            
        }
        armazen.info(palavras, numeros);
    }
}

