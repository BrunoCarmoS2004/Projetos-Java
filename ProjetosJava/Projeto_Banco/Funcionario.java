package ProjetosJava.Projeto_Banco;
import java.util.Random;
import java.util.Scanner;
public class Funcionario extends Pessoa {
    private Random ramdom = new Random();
    private Scanner scanner = new Scanner(System.in);

    private int id =0, cpf=0;
    private String senha="", nome="";
    

    public Funcionario(int cpf,  String senha, String nome) {
        //Um id com o numero aleatorio para ficar mais realistico
        this.id = ramdom.nextInt(1000)+999;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome; 
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public void setSenha() {
        //Seta senha com no minimo 3 digitos
        while(this.senha.length()<3){
            System.out.println("Digite a sua senha");
            System.out.print("Resposta: ");
            this.senha = scanner.next();
            if (this.senha.length()<3){
                System.out.println("Senha muito pequena");
            }
        }
    }

    public int getCpf() {
        return cpf;
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
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
      
    public void info() {
        System.out.printf("Funcionario %d\n",this.id);
        System.out.printf("Nome %s ° CPF %d\n", this.nome, this.cpf);
        
    }
}
