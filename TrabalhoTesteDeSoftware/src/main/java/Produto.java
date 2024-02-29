import org.apache.commons.lang3.StringUtils;

import javax.swing.text.StyledEditorKit;

public class Produto {

    private String nome;
    private String descricao;
    private String categoria;
    private String preco;
    private String quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, String descricao, String categoria, String preco, String quantidadeEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(String quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String mostrarItens(){
        return "\nNome: "+nome+
                "\nDescrição do Produto: " +descricao+
                "\nCategoria: "+categoria+
                "\npreço: "+preco+
                "\nquantidade no estoque: "+quantidadeEstoque;
    }

    private Boolean verificarNome(){
        return StringUtils.isAlphaSpace(this.nome) && this.nome.length() > 3;
    }
    private Boolean verificarDescricao(){
        return this.descricao.length() < 150;
    }
    private Boolean verificarCategoria(){
        return StringUtils.isAlphaSpace(categoria);
    }
    private Boolean verificarPreco(){
        return StringUtils.isNumeric(this.preco);
    }
    private Boolean verificarQuantidade(){
        return StringUtils.isNumeric(this.quantidadeEstoque);
    }
    public Boolean isValido(){
        return this.verificarDescricao() && this.verificarNome() && this.verificarQuantidade() && this.verificarCategoria() && this.verificarPreco();
    }
}
