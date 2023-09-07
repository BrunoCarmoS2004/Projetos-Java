package ProjetosJava.Projeto_Banco;

import java.util.Scanner;

public class Pessoa implements Interface{
    Scanner scanner = new Scanner(System.in);
    private int id, cpf;
    private String senha, nome, n = "";

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
}
