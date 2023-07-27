package ProjetosJava.Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class PegarNumeros {
    int num = 1;
    float number;
    ArrayList<Float> banana;
    public void numeros(){

        // Create an ArrayList to store the numbers
        ArrayList<Float> numbers = new ArrayList<>();

        // Prompt the user to enter numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual quer numero. Digite apenas 0 para terminar\n");

        // Loop until the user enters 0
        while (true) {
            // Get the user input
            System.out.printf("Digite o %d° numero: ",num);
            number = scanner.nextFloat();
            num++;
            // If the user enters 0, exit the loop
            if (number == 0) {
                break;
            }
            // Add the number to the list
            banana = numbers;
            banana.add(number);
            
        }
    }
        
    }

