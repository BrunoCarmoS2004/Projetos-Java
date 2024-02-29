public class Funcionalidades {
    public Boolean AdicionarProduto (String nome,String descricao,String categoria,String preco,String quantidadeEstoque){

        Produto produto = new Produto(nome, descricao, categoria, preco, quantidadeEstoque);
        if (!produto.isValido()){
            System.out.println("""
                    
                    Produto possui campos inválidos
                    
                    """);
            return false;
        }
        System.out.println("""
                
                Produto possui todos os campos válidos""");
        return true;
    }
}
