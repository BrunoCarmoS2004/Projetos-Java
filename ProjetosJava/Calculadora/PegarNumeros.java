package ProjetosJava.Calculadora;

import java.util.Scanner;

public class PegarNumeros {
        int num = 1;
        float[] vetorNumeros;
        int resp = 1;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
    public void numeros(){
        //colocar o while aqui
        for (i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros = new float[num];
            while (resp == 1){
            System.out.printf("Escreva o %d° numero: ",num);
            vetorNumeros[i] = scanner.nextFloat();
            System.out.println("Deseja adicionar mais um numero? ");
            System.out.println("1 - SIM || 2 - NÃO");
            resp = scanner.nextInt();
            if (resp == 2 && num ==1){
                System.out.println("Tem que adicionar pelo menos mais um numero!");
                resp = 1;
            }
            num++;
            }
            
        }
        
    }
}
