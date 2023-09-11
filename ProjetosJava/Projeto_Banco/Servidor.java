package ProjetosJava.Projeto_Banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Servidor {
    /*O ArrayList é usado como um "Vetor melhorado" no meu código ele esta sendo usado para poder criar mais de um cliente sem precisar de um método grande
    por exemplo: Você coloca todas as informações dentro do objeto de cliente e por fim voce cria uma nova partição do ArrayList vai ser criada com todos os valores inseridos no Objeto, como nome, id, senha, etc, usando o nome do arraylist.add(nome do objeto) 

    Em vez de usar algum método parecido com esse:

    Scanner scanner = new Scanner(System.in);
        int taman = 1, i = 0, k = 0;
        int[]num1;
        int[]num1beckUp;
        num1 = new int[taman];
        num1beckUp = new int[taman];
        for (i = 0; i < 4; i++) {
            System.out.print("Digite um numero: ");
            num1[i] = scanner.nextInt();
            num1beckUp[i] = num1[i];
            taman++;
            num1 = new int[taman];
            num1[i] = num1beckUp[i];
            num1beckUp = new int[taman];
        }
        for (i = 0; i < num1.length; i++) {
            System.out.println(num1[k++]);
        }

    Podemos usar simplesmente 
        int num1;
        ArrayList<> num = new ArrayList<>();
        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();
        num.add(num1);

        for(i : num){
            sout(i)
        }
    */
    ArrayList<Cliente> cli = new ArrayList<Cliente>();
    ArrayList<Funcionario> fun = new ArrayList<Funcionario>();
    Scanner scanner = new Scanner(System.in);

    private int respCpf, c;
    private String respNome, respSenha = "";
    private float totalInvestimento, investimento, numInvestimento = 0.01f;

    //Criação dos Clientes (Cliente)
    public void criarCliente(int qtdClientes) {
        respSenha = "";
        if (qtdClientes == 0) {
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
        while (respSenha.length() < 3) {
            System.out.println("Digite a sua senha");
            System.out.print("Resposta: ");
            respSenha = scanner.next();
            if (respSenha.length() < 3) {
                System.out.println("Senha muito pequena\n");
            }
        }
        System.out.println("Terminamos por aqui...\n");
        System.out.println("Algumas dessas informações poderam ser mudadas");
        System.out.println();
        Cliente cliente = new Cliente(respCpf, respSenha, respNome);
        cli.add(cliente);
    }
    
    //Mostrar os Clientes Cadastrados (Cliente)
    public void mostrarClientes(int qtdClientes) {
        if (qtdClientes == 0) {
            System.out.println("Não há clientes cadastrados");
        } else {
            c = 0;
            System.out.println("Aqui estão os clientes cadastrados");
            for (Cliente i : cli) {
                System.out.println();
                System.out.print(c + " - " + i);
                System.out.println();
                c++;
            }
        }

    }
    
    //Login com o cliente desejado (Cliente)
    public void loginCliente(int numClientes) {
        while (true) {
            System.out.println("Digite seu CPF ou seu ID");
            int cpfIdLogin = scanner.nextInt();
            if (cpfIdLogin == cli.get(numClientes).getId() || cpfIdLogin == cli.get(numClientes).getCpf()) {
                break;
            } else {
                System.out.println("Id ou Cpf invalido");
            }
        }
        while (true) {
            System.out.println("Digite sua senha");
            String senhaLogin = scanner.next();
            if (senhaLogin.equals(cli.get(numClientes).getSenha())) {
                break;
            } else {
                System.out.println("Senha invalida");
            }
        }
    }

    //Fazer deposito com o cliente (Cliente)
    public void depositar(float dinheiro, int numClientes) {
        cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() + dinheiro);
        System.out.println("Seu saldo algora é de: R$" + cli.get(numClientes).getSaldo());
    }

    //Fazer saque com o cliente (Cliente)
    public void sacar(float dinheiro, int numClientes) {
        if (cli.get(numClientes).getSaldo() < dinheiro) {
            System.out.println("Saldo insuficiente");

        } else {
            cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() - dinheiro);
            System.out.println("Seu novo saldo algora é de: R$" + cli.get(numClientes).getSaldo());

        }
    }

    //Pagar conta com o cliente (Cliente)
    public void pagarConta(float dinheiro, int numClientes) {
        if (cli.get(numClientes).getSaldo() < dinheiro) {
            float aaa = cli.get(numClientes).getSaldo();
            float aaa2 = 0f;
            for (int i = 0; aaa < dinheiro; dinheiro--) {
                aaa2++;
            }
            cli.get(numClientes).setSaldo(0);
            cli.get(numClientes).setDebito(cli.get(numClientes).getDebito() + aaa2);
            System.out.println("Sua conta foi paga!");
            System.out.println(
                    "Porém, seu saldo não era o suficiente, então o restante que faltou virou créditos para pagar");
            System.out.println("O valor a pagar dos créditos é R$" + cli.get(numClientes).getDebito());
        } else {
            cli.get(numClientes).setSaldo(cli.get(numClientes).getSaldo() - dinheiro);
            System.out.println("Sua conta foi paga!");
            System.out.println("E seu novo saldo algora é de: R$" + cli.get(numClientes).getSaldo());
        }
    }

    //Ver e pagar os créditos pendentes (Cliente)
    public void verPagarCreditos(int numClientes) {
        System.out.println("Seu debito pendente é " + cli.get(numClientes).getDebito());
        while (true) {
            float saldo = cli.get(numClientes).getSaldo(), debito = cli.get(numClientes).getDebito();
            int escolha = 1;
            System.out.println("Deseja pagar agora? 1-Sim 2-não");
            escolha = scanner.nextInt();
            if (escolha == 2) {
                break;
            }
            if (saldo < debito) {
                System.out.println("Saldo insuficiente");
                break;
            } else {
                cli.get(numClientes).setSaldo(saldo - debito);
                cli.get(numClientes).setDebito(0);
                System.out.println("Seus débitos foram pagos");
                break;
            }
        }
    }

    //Fazer investimento com base nos valores de investimento do funcionario (Cliente)
    public void investimento(float dinheiro, int numClientes) {
        while (true) {
            if (cli.get(numClientes).getSaldo() == 0 || dinheiro > cli.get(numClientes).getSaldo()) {
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

    //Mudar senha (Cliente)
    public void mudarSenha(int numClientes) {
        System.out.println("Tem certeza que deseja mudar sua senha?");
        System.out.println("1 - SIM, 2 - NÃO");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            cli.get(numClientes).setSenha();
            System.out.println("Senha atualizada");
        } else {
            System.out.println("Ok...");
        }
    }

    //Criação do funcionario, APENAS 1 (Funcionario)
    public void criarFuncionario(int qtdFuncionarios) {
        if (qtdFuncionarios == 1) {
            System.out.println("Ja existe funcionario cadastrado!");
        } else {
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
            while (respSenha.length() < 3) {
                System.out.println("Digite a sua senha");
                System.out.print("Resposta: ");
                respSenha = scanner.next();
                if (respSenha.length() < 3) {
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

    //Login com o funcionario (Funcionario)
    public void loginFuncionario() {
        while (true) {
            while (true) {
                System.out.println("Digite seu CPF ou seu ID");
                int cpfIdLogin = scanner.nextInt();
                if (cpfIdLogin == fun.get(0).getId() || cpfIdLogin == fun.get(0).getCpf()) {
                    break;
                } else {
                    System.out.println("Id ou Cpf invalido");
                }
            }
            while (true) {
                System.out.println("Digite sua senha");
                String senhaLogin = scanner.next();
                if (senhaLogin.equals(fun.get(0).getSenha())) {
                    break;
                } else {
                    System.out.println("Senha invalida");
                }
            }
            break;
        }
    }

    //mudar valores de investimento (Funcionario)
    public void setNumInvestimento(Float numInvestimento) {
        if (numInvestimento > 1) {
            float porcInvestimento = numInvestimento / 100;
            this.numInvestimento = porcInvestimento;
        } else {
            this.numInvestimento = numInvestimento;
        }

    }

    //Excluir algum cliente (Funcionario)
    public void excluirCliente(int numClientes) {
        cli.remove(numClientes);
        System.out.println("Cliente removido");
        System.out.println("Ok...");
    }
}
