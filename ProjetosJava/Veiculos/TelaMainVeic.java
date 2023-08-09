package ProjetosJava.Veiculos;

import java.util.Scanner;

public class TelaMainVeic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 5;
        int escolha1 =5;
        System.out.println("Bem vindo a garagem C-137");
        System.out.println("Aqui você poderam adicionar, modificar, excluir e apostar corrida com carros, motos, aviões ou barcos!");
        System.out.println("Escolha uma das opções da tebela abaixo");
        while (escolha1 < 1 || escolha1 > 3){
            System.out.println("---------------------------"
            +"1 - Carro"
            +"2 - Motos"
            +"2 - Avião"
            +"3 - Barco");
            escolha1 = scanner.nextInt();
        }

        switch(escolha1){
            case 1:
            System.out.println("asaa");
        }
    }
}
