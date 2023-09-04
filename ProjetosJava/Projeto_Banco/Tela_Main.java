package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class Tela_Main {
    public static void main(String[] args) {
        int numClientes = 0, respIncio = 1;
        Scanner scanner = new Scanner(System.in);
        Servidor cliente = new Servidor();
        /*
        
        cliente.criarCliente(numClientes);
        //cliente.mostrarClientes();
        System.out.println(cliente.cli.get(0).getNome());
        cliente.cli.get(0).info();
        */

        System.out.println("BEM VINDO AO BANCO C-137\n");
        System.out.println("O que deseja fazer?\n");

        while(respIncio != 0){
            System.out.println("-----------------------------|\n"
            +"| 1 - Logar como cliente     |\n"
            +"------------------------------\n"
            +"| 2 - Logar como Funcionario |\n"
            +"------------------------------\n"
            +"| 3 - Cadastrar cliete       |\n"
            +"------------------------------\n"
            +"| 4 - Cadastrar Funcionario  |\n"
            +"------------------------------\n"
            +"---------> 0 - SAIR <---------\n");
            System.out.print("Resposta: ");
            respIncio = scanner.nextInt();
            if (respIncio == 0){
                respIncio = 0;
            }
            switch(respIncio){
                case 1:
                    //login Cliente
                break;
                
                case 2:
                    //login Funcionario
                break;
    
                case 3:
                    cliente.criarCliente(numClientes);
                    respIncio = 0;
                break;
    
                case 4:
                    cliente.criarFuncionario(numClientes);
                    respIncio = 0;
                break; 
            }
        }

        
    }
}
