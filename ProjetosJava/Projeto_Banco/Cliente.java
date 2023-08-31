import java.util.Random;

public class Cliente implements Pessoa{
    Random ramdom = new Random();
    int id =0, cpf=0, numConta = 0, agencia=0, banco=0;
    String senha="", nome="";
    float dinheiro;
    

    public Cliente(int id, int cpf, int numConta, int agencia, int banco, String senha, String nome, float dinheiro) {
        this.id = ramdom.nextInt(1000)+999;
        this.cpf = cpf;
        this.numConta = ramdom.nextInt(1000)+999;
        this.agencia = ramdom.nextInt(1000)+999;
        this.banco = 0275;
        this.senha = senha;
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    @Override
    public int getId() {

        return id;
    }

    @Override
    public String getSenha() {
        
        return senha;
    }

    @Override
    public void setSenha(String senha) {
       this.senha = senha; 
        
    }
    
}
