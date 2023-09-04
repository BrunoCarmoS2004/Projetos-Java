package ProjetosJava.Projeto_Banco;
import java.util.ArrayList;
import java.util.Scanner;
public class Servidor {
    ArrayList<Cliente> cli = new ArrayList<Cliente>();
    ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    Scanner scanner = new Scanner(System.in);

    int respCpf, i, c, numClientes;
    String respNome, respSenha, perfSenha = "";
    
    
    
    public void criarCliente(int numClientes){
            if (numClientes == 0){
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
            while(perfSenha.length()<3){
                System.out.println("Digite a sua senha");
                System.out.print("Resposta: ");
                perfSenha = scanner.next();
                if (perfSenha.length()<3){
                    System.out.println("Senha muito pequena\n");
                }else{
                    respSenha = perfSenha;
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
            for (Cliente i : cli) {
                System.out.print("Numero do cliente "+i+ " é "+ c);
                System.out.println();
                c++;

            }   
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void criarFuncionario(int numClientes){
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
        while(perfSenha.length()<3){
            System.out.println("Digite a sua senha");
            System.out.print("Resposta: ");
            perfSenha = scanner.next();
            if (perfSenha.length()<3){
                System.out.println("Senha muito pequena\n");
            }else{
                respSenha = perfSenha;
            }
        }
        System.out.println("Agora você é um Funcionario cadastrado...\n");
        System.out.println("Algumas dessas informações poderam ser mudadas");
        System.out.println();
        Funcionario cliente = new Funcionario(respCpf, respSenha, respNome);
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void loginCliente(){
        
    }

    public void loginFuncionario(){
        
    }

}
