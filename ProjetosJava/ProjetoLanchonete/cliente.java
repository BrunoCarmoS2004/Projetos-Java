package ProjetosJava.ProjetoLanchonete;

public class Cliente extends Pessoa{
        private String celular;
        private String endereco;

        public Cliente(String nome, String celular, String endereco) {
                super(nome);
                this.celular = celular;
                this.endereco = endereco;
        }

        public String getCelular() {
                return celular;
        }

        public void setCelular(String celular) {
                this.celular = celular;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        @Override
        public void fazerPedido(Pessoa pessoa, Lanche lanche) {
                System.out.println("O pedido está sendo feito");
        }
}