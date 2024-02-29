import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<Produto>();
        Funcionalidades funcionalidades = new Funcionalidades();
        int resposta = 5;
        String Skip;

        while (resposta != 0){
            System.out.println("1 - Mostrar todos os itens");
            System.out.println("2 - Adicionar novo item");
            System.out.println("3 - Atualizar item");
            System.out.println("4 - Excluir item");
            System.out.println("0 - Sair");
            resposta = scanner.nextInt();

            if (resposta == 1){
                System.out.println();
                int a = 1;
                for (Produto listaProduto : listaProdutos) {
                    System.out.println("Produto "+a+listaProduto.mostrarItens());
                    System.out.println();
                    a++;
                }
            }
            if (resposta == 2){

                String nome, descricao, categoria, quantidadeEstoque, preco;

                System.out.println();
                Skip = scanner.nextLine();
                System.out.println("Qual será o nome do produto? ");
                nome = scanner.nextLine();
                nome = nome.toLowerCase();
                System.out.println("Qual a descrição do produto? ");
                descricao = scanner.nextLine();
                System.out.println("Qual a categoria do produto? ");
                categoria = scanner.nextLine();
                System.out.println("Qual o preco do produto? ");
                preco = scanner.nextLine();
                System.out.println("Qual será a quantidade de estoque inicial");
                quantidadeEstoque = scanner.nextLine();
                if (funcionalidades.AdicionarProduto(nome, descricao, categoria, preco, quantidadeEstoque)){
                    listaProdutos.add(criarProduto(nome, descricao, categoria, preco, quantidadeEstoque));
                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println();
                }
            }
            if (resposta == 3){

                String qualEditar;

                System.out.println();
                System.out.println("Qual o NOME do produto que você gostaria de editar? ");
                for (Produto listaProduto : listaProdutos){
                    System.out.println(listaProduto.getNome());
                }
                Skip = scanner.nextLine();
                qualEditar = scanner.nextLine();
                qualEditar = qualEditar.toLowerCase();
                int index = 0;
                for (Produto nomeproduto : listaProdutos){
                    int qualEditarNum;
                    index++;
                    if (nomeproduto.getNome().equals(qualEditar)){
                        System.out.println();
                        System.out.println("""
                                Qual informação do produto você gostaria de editar?
                                1 - Nome
                                2 - Descrição
                                3 - Categoria
                                4 - Preço
                                5 - Quantidade do estoque""");
                        qualEditarNum = scanner.nextInt();
                        if (qualEditarNum == 1){
                            System.out.println();
                            System.out.println("Qual será o novo Nome?");
                            Skip = scanner.nextLine();
                            String mudar = scanner.nextLine();
                            listaProdutos.get(index-1).setNome(mudar);
                            System.out.println("""
                                    
                                    Campo alterado com sucesso
                                    
                                    """);
                        }
                        if (qualEditarNum == 2){
                            System.out.println();
                            System.out.println("Qual será a nova Descrição?");
                            Skip = scanner.nextLine();
                            String mudar = scanner.nextLine();
                            listaProdutos.get(index-1).setDescricao(mudar);
                            System.out.println("""
                                    
                                    Campo alterado com sucesso
                                    
                                    """);
                        }
                        if (qualEditarNum == 3){
                            System.out.println();
                            System.out.println("Qual será a nova Categoria?");
                            Skip = scanner.nextLine();
                            String mudar = scanner.next();
                            listaProdutos.get(index-1).setCategoria(mudar);
                            System.out.println("""
                                    
                                    Campo alterado com sucesso
                                    
                                    """);
                        }
                        if (qualEditarNum == 4){
                            System.out.println();
                            System.out.println("Qual será o novo Preço?");
                            Skip = scanner.nextLine();
                            String mudar = scanner.nextLine();
                            listaProdutos.get(index-1).setPreco(mudar);
                            System.out.println("""
                                    
                                    Campo alterado com sucesso
                                    
                                    """);
                        }
                        if (qualEditarNum == 5){
                            System.out.println();
                            System.out.println("Qual será a nova Quantidade do estoque?");
                            Skip = scanner.nextLine();
                            String mudar = scanner.nextLine();
                            listaProdutos.get(index-1).setQuantidadeEstoque(mudar);
                            System.out.println("""
                                    
                                    Campo alterado com sucesso
                                    
                                    """);
                        }
                    }
                }
            }
            if (resposta == 4){

                String qualRemover;

                System.out.println();
                System.out.println("Qual o NOME do produto que você gostaria de remover? ");
                for (Produto listaProduto : listaProdutos){
                    System.out.println(listaProduto.getNome());
                }
                Skip = scanner.nextLine();
                qualRemover = scanner.nextLine();
                qualRemover = qualRemover.toLowerCase();
                for (int i = 0; i < listaProdutos.size(); i++) {
                    if (qualRemover.equals(listaProdutos.get(i).getNome())){
                        listaProdutos.remove(i);
                        System.out.println("""
                                
                                Item removido com sucesso!
                                """);
                    }
                }
            }
        }
    }
    public static Produto criarProduto(String nome, String descricao, String categoria, String preco, String quantidadeEstoque) {
        return new Produto(nome, descricao, categoria, preco, quantidadeEstoque);
    }
}
