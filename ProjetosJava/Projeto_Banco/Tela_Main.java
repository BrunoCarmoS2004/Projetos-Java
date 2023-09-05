package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class Tela_Main {
    public static void main(String[] args) {
        int qtdClientes = 0, respIncio = 1, numClientes;
        Scanner scanner = new Scanner(System.in);
        Servidor cliente = new Servidor();
        Servidor funcionario = new Servidor();
        /*
        
        cliente.criarCliente(numClientes);
        //cliente.mostrarClientes();
        System.out.println(cliente.cli.get(0).getNome());
        
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
                    while(true){
                        if(qtdClientes == 0){
                            System.out.println("Não há clientes cadastrados!");
                            break;
                        }
                        System.out.println("Escolha um");
                        cliente.mostrarClientes();
                        numClientes = scanner.nextInt();
                        cliente.loginCliente(numClientes);
                    }
                break;
                
                case 2:
                    //login Funcionario
                break;
    
                case 3:
                    cliente.criarCliente(qtdClientes);
                    qtdClientes++;
                break;
    
                case 4:
                    funcionario.criarFuncionario(qtdClientes);
                    respIncio = 0;
                break; 
            }
        }
        cliente.cli.get(0).info();
        
    }
}
