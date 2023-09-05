package ProjetosJava.Projeto_Banco;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;
public class Servidor {
    ArrayList<Cliente> cli = new ArrayList<Cliente>();
    ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    Scanner scanner = new Scanner(System.in);

    private int respCpf, i, c, numClientes, qtdClientes;
    private String respNome, respSenha = "";
    
    
    
    public void criarCliente(int qtdClientes){
            respSenha = "";
            if (qtdClientes == 0){
                System.out.println("Não tem conta?\n");
                System.out.println("É simples e fácil criar uma!\n");
                System.out.println("Vamos começar!\n");
            }
            System.out.println("Por favor digite o nome COMPLETO:");
            System.out.print("Sua resposta: ");
            respNome = scanner.next();
            System.out.println();
            System.out.println("Facil né?");
            System.out.println("Vou precisar de mais algumas informações por segurança\n");
            System.out.println("Digite seu CPF, não se preocupe suas informações não seram divulgadas");
            System.out.print("Resposta: ");
            respCpf = scanner.nextInt();
            System.out.println();
            System.out.println("Digite sua data de nascimento");
            System.out.print("Resposta: ");
            scanner.next();
            System.out.println();
            System.out.println("Digite o nome da sua mãe");
            System.out.print("Resposta: ");
            scanner.next();
            System.out.println("Digite o nome do seu pai");
            System.out.print("Resposta: ");
            scanner.next();
            System.out.println("Por fim digite sua incrivel senha!");
            while(respSenha.length()<3){
                System.out.println("Digite a sua senha");
                System.out.print("Resposta: ");
                respSenha = scanner.next();
                if (respSenha.length()<3){
                    System.out.println("Senha muito pequena\n");
                }
        }
        System.out.println("Terminamos por aqui...\n");
        System.out.println("Algumas dessas informações poderam ser mudadas");
        System.out.println();
        Cliente cliente = new Cliente(respCpf, respSenha, respNome);
        cli.add(cliente);
        
        }
    public void mostrarClientes(){
            System.out.println("Aqui estão os clientes cadastrados");
            c = 0;
            for (Cliente i : cli) {
                System.out.println();
                System.out.print(c +" - " +i);
                System.out.println();
                c++;
            }   
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void criarFuncionario(int qtdFuncionarios){
        if (qtdClientes == 1){
            System.out.println("Ja existe funcionario cadastrado!");
        }else{
            System.out.println("Funcionario novo?\n");
            System.out.println("Vamos cadastralo!\n");
            System.out.println("Por favor digite o nome COMPLETO:");
            System.out.print("Sua resposta: ");
            respNome = scanner.next();
            System.out.println();
            System.out.println("Vou precisar de mais algumas informações por segurança\n");
            System.out.println("Digite seu CPF");
            System.out.print("Resposta: ");
            respCpf = scanner.nextInt();
            System.out.println();
            System.out.println("Por fim!");
            while(respSenha.length()<3){
                System.out.println("Digite a sua senha");
                System.out.print("Resposta: ");
                respSenha = scanner.next();
                if (respSenha.length()<3){
                    System.out.println("Senha muito pequena\n");
                }
            }
            System.out.println("Agora você é um Funcionario cadastrado...\n");
            System.out.println("Algumas dessas informações poderam ser mudadas");
            System.out.println();
            Funcionario cliente = new Funcionario(respCpf, respSenha, respNome);
        }
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void loginCliente(int numClientes){
        while(true){
            while(true){
                System.out.println("Digite seu CPF ou seu ID");
                int cpfIdLogin = scanner.nextInt();
                if(cpfIdLogin == cli.get(numClientes).getId()||cpfIdLogin == cli.get(numClientes).getCpf()){
                    break;
                }else{
                    System.out.println("Id ou Cpf invalido");
                }
            }
            while(true){
                System.out.println("Digite sua senha");
                String senhaLogin = scanner.next();
                if(senhaLogin.equals(cli.get(numClientes).getSenha())){
                    break;
                }else{
                    System.out.println("Senha invalida");
                }
            }
            break;
        }
    }

    public void loginFuncionario(){
        while(true){
            while(true){
                System.out.println("Digite seu CPF ou seu ID");
                int cpfIdLogin = scanner.nextInt();
                if(cpfIdLogin == fun.get(0).getId()||cpfIdLogin == fun.get(0).getCpf()){
                    break;
                }else{
                    System.out.println("Id ou Cpf invalido");
                }
            }
            while(true){
                System.out.println("Digite sua senha");
                String senhaLogin = scanner.next();
                if(senhaLogin.equals(fun.get(0).getSenha())){
                    break;
                }else{
                    System.out.println("Senha invalida");
                }
            }
            break;
        }
    }

}
