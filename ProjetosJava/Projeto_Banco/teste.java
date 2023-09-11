package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taman = 1, i = 0, j = 0;
        int[]num1;
        int[]num1beckUp;
        num1 = new int[taman];
        num1beckUp = new int[taman];  
        
        for (i = 0; i < 4; i++) {
            System.out.print("Digite um numero: ");
            num1[i] = scanner.nextInt();
            
            for(i =0; num1[i] == 0;i++){
                num1beckUp[i] = num1[i]; 
            }
            
            taman++;
            num1 = new int[taman];
            for(i =0; num1beckUp[i] != 0;i++){
                num1[i] = num1beckUp[i];
            }
            num1beckUp = new int[taman];
        }
        for (i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
