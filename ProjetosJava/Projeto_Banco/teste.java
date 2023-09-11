package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taman = 1;
        int i =0;
        int c = 0;
        int[]num1;
        int[]num1beckUp;
        num1 = new int[taman];
        num1beckUp = new int[taman];  
        
        System.out.println("Os numeros adicionados foram");
        for (i = 0; i < 15; i++) {

            System.out.print("Digite um numero: ");
            num1[i] = scanner.nextInt();
            num1beckUp[i] = num1[i];
            taman++;
            num1 = new int[taman];
            num1[i] = num1beckUp[i];
            num1beckUp = new int[taman];
            i++;
            c++;
        }
        
    }
}
