package ProjetosJava.Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class PegarNumeros {
    int num = 1;
    float number;
    ArrayList<Float> banana;
    public void numeros(){

        
        ArrayList<Float> numbers = new ArrayList<>();

        
        Scanner scanner = new Scanner(System.in);
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
    }
        
    }

