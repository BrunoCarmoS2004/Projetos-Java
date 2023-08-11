package ProjetosJava.Veiculos;

import java.util.Scanner;

public class TelaMainVeic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 5;
        int escolha1 = 5;
        int escolha2 = 5;
        int vel = 70;
        String nome = "";
        String marca= "";
        String cor= "";
        int rodas = 4;
        Veiculos v1 = new Veiculos(vel, nome, marca, cor, rodas);
        System.out.println("Bem vindo a garagem C-137");
        System.out.println("Aqui você poderam adicionar, modificar, excluir e apostar corrida com carros, motos, aviões ou barcos!");
        System.out.println("Escolha uma das opções da tebela abaixo");
        while (escolha1 !=0 ){
            System.out.println("---------------------------"
            +"1 - Carro"
            +"2 - Motos"
            +"3 - Avião"
            +"4 - Barco"
            +"0 - Sair");
            escolha1 = scanner.nextInt();
            switch(escolha1){
                case 1:
                while(true){
                    System.out.println("1 - Adicionar Carro"
                    +"2 - Modificar Carro"
                    +"3 - Excluir Carro"
                    +"4 - Apostar Corrida entre os carros"
                    +"0 - Voltar");
                    escolha2 = scanner.nextInt();
                    if(escolha2 == 1){
                        //Adicionar carros;
                        Carros.setVel(10);
                    }else if(escolha1 == 2){
                        //Modificar carro
                    }else if(escolha1 == 3){
                        //Excluir carro
                    }else if(escolha1 == 4){
                        //Corrida
                    }else if(escolha1 == 0){
                        break;
                    }
                }
            } 
        }
    }
}
