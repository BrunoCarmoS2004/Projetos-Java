package ProjetosJava.Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class PegarNumeros {
    int num = 1;
    float number;
    ArrayList<Float> banana;
    public void numeros(int raiz){
        ArrayList<Float> numbers = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);
        if (raiz == 0){
            System.out.println("Digite qual quer numero. Digite apenas 0 para terminar\n");
            while (true) {
                System.out.printf("Digite o %d° numero: ",num);
                number = scanner.nextFloat();
                num++;
                if (number == 0) {
                    break;
                }
                banana = numbers;
                banana.add(number);
                
            }
        }else if (raiz == 1){
            System.out.println("Digite o numero para descobrir a raiz dele\n "); 
            System.out.print("Digite o numero: ");
            while (num == 1){
                number = scanner.nextFloat();
                banana = numbers;
                banana.add(number);
                num++;
            }
        }else{
            int num = 0;
            int numTexto =1;
            System.out.println("Digite 2 numeros (base, expoente)\n");
            while (num < 2 ){
                System.out.printf("Digite o %d° numero: ",numTexto);
                number = scanner.nextFloat();
                banana = numbers;
                banana.add(number);
                num++;
                numTexto++;
            }
        }
    }
}        


