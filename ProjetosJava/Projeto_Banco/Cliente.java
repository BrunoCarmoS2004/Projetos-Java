import java.util.Random;
import java.util.Scanner;

public class Cliente implements Pessoa{
    Random ramdom = new Random();
    Scanner scanner = new Scanner(System.in);
    int id =0, cpf=0, numConta = 0, agencia=0, banco=0;
    String senha="", nome="", n = "";
    float saldo = 0, debito = 0, investimento = 0, tota_inves=0;
    

    public Cliente(int cpf,  String senha, String nome, float saldo) {
        this.id = ramdom.nextInt(1000)+999;
        this.numConta = ramdom.nextInt(10000)+9999;
        this.agencia = ramdom.nextInt(1000)+999;
        this.banco = 0277;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.saldo = saldo;
        this.investimento = getInvestimento();
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
        while(n.length()<3){
            System.out.println("Digite a sua senha");
            System.out.print("Resposta: ");
                n = scanner.next();
            if (n.length()<3){
                System.out.println("Senha muito pequena");
            }else{
                this.senha = n;
            }
       }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    @Override
    public void info(){
        System.out.println(this.nome+"\n");
        System.out.printf("Agencia %d ° Conta %d\n",this.agencia, this.numConta);
        System.out.printf("Banco %d ° Banco C-137 S.A\n",this.banco);
    }
    public void dinheiro(){
        System.out.printf("Saldo: %f\n", this.saldo);
        System.out.printf("Saldo Creditado: %f\n", this.debito);
        System.out.printf("Valor investido: %f\n",investimento);
        System.out.printf("Total ganho com investimentos: %d\n",this.tota_inves);

    }

    public float getInvestimento() {
        return investimento;
    }

    public void setInvestimento(float investimento) {
        this.investimento = investimento;
    }

    public float getTota_inves() {
        return tota_inves;
    }

    public void setTota_inves(float tota_inves) {
        this.tota_inves = tota_inves;
    }

    
    
}
