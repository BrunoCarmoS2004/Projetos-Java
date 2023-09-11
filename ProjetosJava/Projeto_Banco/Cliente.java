package ProjetosJava.Projeto_Banco;

import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa{
    private Random ramdom = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int id =0, cpf=0, numConta = 0, agencia=0, banco=0;
    private String senha="", nome="";
    private float saldo = 0, debito = 0, investimento = 0;
    

    public Cliente(int cpf,  String senha, String nome) {
        //Um id com o numero aleatorio para ficar mais realistico
        this.id = ramdom.nextInt(1000)+999;
        this.numConta = ramdom.nextInt(10000)+9999;
        this.agencia = 0001;
        this.banco = 0137;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.saldo = getSaldo();
        this.investimento = getInvestimento();
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha() {
        //Seta senha com no minimo 3 digitos
        this.senha = "";
        while(this.senha.length()<3){
            System.out.println("Digite a sua senha com pelo menos 3 digitos");
            System.out.print("Resposta: ");
            this.senha = scanner.next();
            if (this.senha.length()<3){
                System.out.println("Senha muito pequena");
            }
        }
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
        /*
        Para usar o CPF com o tamanho padrão de CPF, não vou usar por que no momento não precisa e fica complicado para ficar testando

        this.cpf = "";
        while(this.cpf.length()<11){
            System.out.println("Digite a sua senha com pelo menos 3 digitos");
            System.out.print("Resposta: ");
            this.senha = scanner.next();
            if (this.senha.length()<11){
                System.out.println("Senha muito pequena");
            }
        }
        */
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDebito() {
        return this.debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public void info(){
        System.out.print("---->"+this.nome+" ID "+this.id+"<----\n");
        System.out.printf("Agencia %d ° Conta %d\n",this.agencia, this.numConta);
        System.out.printf("Banco %d ° Banco C-137 S.A\n",this.banco);
        System.out.println();
    }
    
    public void dinheiro(){
        System.out.printf("Saldo: %f\n", this.saldo);
        System.out.printf("Saldo Creditado: %f\n", this.debito);
        System.out.printf("Valor investido: %f\n",investimento);
    }
    
    @Override
    public String toString() {
        //Usado no mostrar Cliente
        return nome + "\n";
    }

    public float getInvestimento() {
        return this.investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }   
}
