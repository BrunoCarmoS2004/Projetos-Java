package ProjetosJava.Calculadora;

import java.util.Scanner;

public class PegarNumeros {
        int num = 1;
        float[] vetorNumeros;
        int resp = 1;
        int i = 0,pato = 1;        
        Scanner scanner = new Scanner(System.in);
    public void numeros(){
            System.out.println("Quantos numeros vc vai querer usar?");
            System.out.print("Resposta: ");
            num = scanner.nextInt();
            vetorNumeros = new float[num];
       
            for (i = 0; i < vetorNumeros.length; i++){
                System.out.printf("Escreva o %d° numero: ",pato);
                vetorNumeros[i] = scanner.nextFloat();
                ++pato;
            }
        }
        
    }

