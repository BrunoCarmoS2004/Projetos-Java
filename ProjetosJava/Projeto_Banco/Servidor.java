package ProjetosJava.Projeto_Banco;
import java.util.ArrayList;
import java.util.Scanner;



public class Servidor{
    ArrayList<Cliente> cli = new ArrayList<Cliente>();
    ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    Scanner scanner = new Scanner(System.in);

    private int respCpf, i, c, numClientes, qtdClientes;
    private String respNome, respSenha = "";
    private float totalInvestimento, investimento, numInvestimento = 0.01f;
    
    
    
    
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
    public void mostrarClientes(int qtdClientes){
            if(qtdClientes == 0){
                System.out.println("Não há clientes cadastrados");
            }else{
                System.out.println("Aqui estão os clientes cadastrados");
                c = 1;
                for (Cliente i : cli) {
                System.out.println();
                System.out.print(c +" - " +i);
                System.out.println();
                c++;
                }   
            }
            
        }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void criarFuncionario(int qtdFuncionarios){
        if (qtdFuncionarios == 1){
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
            Funcionario funcio = new Funcionario(respCpf, respSenha, respNome);
            fun.add(funcio);
        }
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void loginCliente(int numClientes){
        while(true){
            while(true){
                System.out.println("Digite seu CPF ou seu ID");
                int cpfIdLogin = scanner.nextInt();
                if(cpfIdLogin == cli.get(numClientes).getId() || cpfIdLogin == cli.get(numClientes).getCpf()){
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
                if(cpfIdLogin == fun.get(0).getId() || cpfIdLogin == fun.get(0).getCpf()){
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

    public void depositar(float dinheiro, int numClientes){
        cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() + dinheiro);
        System.out.println("Seu saldo algora é de: R$" + cli.get(numClientes).getSaldo());
    }

    public void sacar(float dinheiro, int numClientes){
        if (cli.get(numClientes).getSaldo() < dinheiro){
            System.out.println("Saldo insuficiente");
            
        }else{
            cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() - dinheiro);
            System.out.println("Seu novo saldo algora é de: R$" + cli.get(numClientes).getSaldo());
            
        }
    }

    public void pagarConta(float dinheiro, int numClientes){
        if (cli.get(numClientes).getSaldo() < dinheiro){
            float aaa = cli.get(numClientes).getSaldo();
            float aaa2 = 0f;
            for (int i = 0 ;aaa < dinheiro; dinheiro--) {
                aaa2++;
            }
            cli.get(numClientes).setSaldo(0);
            cli.get(numClientes).setDebito(cli.get(numClientes).getDebito()+aaa2);
            System.out.println("Sua conta foi paga!");
            System.out.println("Porém, seu saldo não era o suficiente, então o restante que faltou virou créditos para pagar");
            System.out.println("O valor a pagar dos créditos é R$" + cli.get(numClientes).getDebito());
        }else{
            cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() - dinheiro);
            System.out.println("Sua conta foi paga!");
            System.out.println("E seu novo saldo algora é de: R$" + cli.get(numClientes).getSaldo());
        }
    }

    public void verPagarCreditos(int numClientes){
        System.out.println("Seu debito pendente é " + cli.get(numClientes).getDebito());
        while(true){
            float saldo = cli.get(numClientes).getSaldo(), debito = cli.get(numClientes).getDebito();
            int escolha = 1;
            System.out.println("Deseja pagar agora? 1-Sim 2-não");
            escolha = scanner.nextInt();
            if(escolha == 2){
                break;
            }
            if(saldo < debito){
                System.out.println("Saldo insuficiente");
                break;
            }else{
                cli.get(numClientes).setSaldo(saldo - debito);
                cli.get(numClientes).setDebito(0);
                System.out.println("Seus débitos foram pagos");
                break;
            }
        }
    }

    public void investimento(float dinheiro, int numClientes){
        while(true){
            if(cli.get(numClientes).getSaldo() == 0 || dinheiro > cli.get(numClientes).getSaldo()){
                System.out.println("Você não tem saldo para investir");
                break;
            }
                System.out.println("Por quantos meses você deseja investir");
                int diasInvestidos = scanner.nextInt();
                totalInvestimento = 1 + numInvestimento;
                int[] vetorDias = new int[diasInvestidos];
                for (int i = 0; i < vetorDias.length; i++) {
                    totalInvestimento *= totalInvestimento;
                }
                investimento = dinheiro * totalInvestimento;
                cli.get(numClientes).setSaldo(investimento);
                System.out.printf("Você investiu %.2f e deu um total de %.2f", dinheiro, investimento);
                System.out.println();
                break;   
        }
    }

    public void setNumInvestimento(Float numInvestimento){
        if(numInvestimento > 1 ){
            float porcInvestimento = numInvestimento /100;
            this.numInvestimento = porcInvestimento;
        }else{
            this.numInvestimento = numInvestimento;
        }
        
    }

    public void excluirCliente(int numClientes){
        System.out.println("Tem certeza que deseja excluir esse cliente?");
        System.out.println("1 - SIM, 2 - NÃO");
        int escolha = scanner.nextInt();
        if(escolha == 1){
            cli.remove(numClientes);
            System.out.println("Cliente removido");
        }else{
            System.out.println("Ok...");
        }
    }
}
