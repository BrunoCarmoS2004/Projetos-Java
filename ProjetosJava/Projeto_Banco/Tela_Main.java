package ProjetosJava.Projeto_Banco;



public class Tela_Main {
    public static void main(String[] args) {
        int numClientes = 0;
        Servidor cliente = new Servidor();
        cliente.criarCliente(numClientes);
        //cliente.mostrarClientes();
        System.out.println(cliente.cli.get(0).getNome());
        cliente.cli.get(0).info();
       
        
        
    }
}
