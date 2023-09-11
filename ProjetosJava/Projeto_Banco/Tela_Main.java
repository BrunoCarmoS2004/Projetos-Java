package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class Tela_Main {
    public static void main(String[] args) {
        int qtdClientes = 0, respIncio = 1, numClientes = 0, excluirCliente=1, qtdFuncionarios = 0;
        Scanner scanner = new Scanner(System.in);
        Servidor cliente = new Servidor();
        Servidor funcionario = new Servidor();

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
                    while(true){
                        if(qtdClientes == 0){
                            System.out.println("Não há clientes cadastrados!");
                            break;
                        }else if (qtdClientes != 0){
                            System.out.println("Escolha um");
                            cliente.mostrarClientes(qtdClientes);
                            numClientes = scanner.nextInt();
                            cliente.loginCliente(numClientes);
                        }
                        int tabCliente = 1;
                        System.out.println("\nBem vindo "+cliente.cli.get(numClientes).getNome()+"\n");
                        System.out.println("Seu Id de login "+cliente.cli.get(numClientes).getId());
                        System.out.println("\nNo nosso sistema você pode fazer:");
                        while(true){
                        System.out.println("-----------------------------|\n"
                        +"| 1 - Depositar Dinheiro     |\n"
                        +"------------------------------\n"
                        +"| 2 - Ver Saldo e Crédito    |\n"
                        +"------------------------------\n"
                        +"| 3 - Sacar Dinheiro         |\n"
                        +"------------------------------\n"
                        +"| 4 - Pagar Contas           |\n"
                        +"------------------------------\n"
                        +"| 5 - Investir               |\n"
                        +"------------------------------\n"
                        +"| 6 - Pagar Créditos         |\n"
                        +"------------------------------\n"
                        +"| 7 - Mudar Senha            |\n"
                        +"------------------------------\n"
                        +"| 8 - Ver Suas informações   |\n"
                        +"------------------------------\n"
                        +"---------> 0 - VOLTAR <---------\n");
                        System.out.println("Escolha o que deseja fazer");
                        System.out.print("Resposta: ");
                        tabCliente = scanner.nextInt();
                        if(tabCliente == 0){
                            break;
                            
                        }
                        switch(tabCliente){
                            case 1:
                                //Depositar
                                System.out.println("Insira o valor para ser depositado: ");
                                System.out.print("R$ ");
                                float clienteDinheiro = scanner.nextFloat();
                                cliente.depositar(clienteDinheiro, numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 2:
                            //ver Saldo
                                System.out.println("Seu saldo é de R$ "+cliente.cli.get(numClientes).getSaldo());
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 3:
                                //sacar
                                System.out.println("Seu saldo atual é: ");
                                System.out.println("Saldo: ");
                                cliente.cli.get(numClientes).getSaldo();
                                System.out.println();
                                System.out.println("Insira o valor para ser sacado: ");
                                System.out.print("R$ ");
                                clienteDinheiro = scanner.nextFloat();
                                cliente.sacar(clienteDinheiro, numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 4:
                                System.out.println("Insira o valor da conta: ");
                                System.out.print("R$ ");
                                clienteDinheiro = scanner.nextFloat();
                                cliente.pagarConta(clienteDinheiro, numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 5:
                                System.out.println("Insira o valor que você queira investir: ");
                                System.out.print("R$ ");
                                clienteDinheiro = scanner.nextFloat();
                                cliente.investimento(clienteDinheiro, numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 6:
                            //Pagar creditos
                                cliente.verPagarCreditos(numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 7:
                                cliente.mudarSenha(numClientes);
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                            case 8:
                                System.out.println("Suas informações são: \n");
                                cliente.cli.get(numClientes).info();
                                System.out.println("Suas informações de Saldo \n");
                                cliente.cli.get(numClientes).dinheiro();
                                System.out.println("Digite algo para voltar");
                                scanner.next();
                            break;
                        }
                    }
                    if(tabCliente == 0){
                        break;
                    }
                }
                break;

////////////////////////////////////////////////////////////////////////////////////
                
                case 2:
                    //login Funcionario
                    while(true){
                        if(qtdFuncionarios == 0){
                            System.out.println("Não há funcionários cadastrados!");
                            break;
                        }
                        funcionario.loginFuncionario();
                        int tabCliente = 1;
                        System.out.println("\nBem vindo "+funcionario.fun.get(0).getNome());
                        System.out.println("\nNo nosso sistema você pode fazer:");
                        while(true){
                            System.out.println("-----------------------------|\n"
                            +"| 1 - Ver Clientes Cadastrados|\n"
                            +"-------------------------------\n"
                            +"| 2 - Mudar % Investimento    |\n"
                            +"-------------------------------\n"
                            +"| 3 - Excluir Cliente         |\n"
                            +"-------------------------------\n"
                            +"---------> 0 - VOLTAR <--------\n");
                            System.out.println("Escolha o que deseja fazer");
                            System.out.print("Resposta: ");
                            tabCliente = scanner.nextInt();
                            if(tabCliente == 0){
                                break;
                            }
                            switch(tabCliente){
                                case 1:
                                    funcionario.mostrarClientes(qtdClientes);
                                    System.out.println("Digite algo para voltar");
                                    scanner.next();
                                break;
                                case 2:
                                    System.out.println("Digite a nova % dos investimentos: ");
                                    System.out.print("% ");
                                    float numInvestimento = scanner.nextFloat();
                                    cliente.setNumInvestimento(numInvestimento);
                                    System.out.println("Digite algo para voltar");
                                    scanner.next();
                                break;
                                case 3:
                                    //Excluir cliente
                                    cliente.mostrarClientes(qtdClientes);
                                    System.out.println("Digite o numero do cliente para excluir: ");
                                    System.out.print("Resposta: ");
                                    excluirCliente = scanner.nextInt();
                                    excluirCliente -=1;
                                    cliente.excluirCliente(excluirCliente);
                                    System.out.println("Digite algo para voltar");
                                    scanner.next();
                                break;
                            }
                        }
                        if(tabCliente == 0){
                            break;
                        }
                    }
                break;
    
                case 3:
                    //Criar Cliente
                    cliente.criarCliente(qtdClientes);
                    qtdClientes++;
                break;
    
                case 4:
                    //Criar Funcionario
                    funcionario.criarFuncionario(qtdFuncionarios);
                    qtdFuncionarios++;
                break; 
            }
        }
    }
}
