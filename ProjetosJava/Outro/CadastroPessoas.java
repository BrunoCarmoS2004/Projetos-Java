package ProjetosJava.Outro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        ArmazenarDadosPessoas armazen = new ArmazenarDadosPessoas();
        ArrayList<String>palavras = new ArrayList<>();
        ArrayList<Integer>numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome, cor, sobreN, sexo;
        int idade = 0;
        int num = 1;
        while (num <= 5){
            if (num ==1){
                System.out.print("Escreva o nome da pessoa: ");
                nome = scanner.next();
                palavras.add(nome);      
                num++;  
            }else if(num == 2){
                System.out.print("Escreva o sobre nome da pessoa: ");
                sobreN = scanner.next();
                palavras.add(sobreN);      
                num++; 
            }else if(num == 3){
                System.out.print("Escreva a cor da pessoa: ");
                cor = scanner.next();
                palavras.add(cor);      
                num++; 
            }else if(num == 4){
                System.out.print("Escreva o sexo/genrero da pessoa: ");
                sexo = scanner.next();
                palavras.add(sexo);      
                num++; 
            }else if(num == 5){
                System.out.print("Escreva a idade da pessoa: ");
                idade = scanner.nextInt();
                numeros.add(idade);      
                num++; 
            }
        }

        
    }
}

