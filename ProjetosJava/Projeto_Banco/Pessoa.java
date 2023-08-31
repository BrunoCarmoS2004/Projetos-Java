public interface Pessoa {
    int id = 0;
    String senha = "";
    abstract int getId();
    abstract String getSenha();
    abstract void setSenha(String senha);
}
