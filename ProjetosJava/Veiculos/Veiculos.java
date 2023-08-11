package ProjetosJava.Veiculos;


public class Veiculos {
    private int vel, rodas;
    private String nome, marca, cor;
    public Veiculos(int vel, String nome, String marca, String cor, int rodas) {
        this.vel = vel;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.rodas = rodas;
    }
    public int getVel() {
        return vel;
    }
    public void setVel(int vel) {
        this.vel = vel;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void info(){
        System.out.println("---------------------");
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Velocidade: %d%n",this.vel);
        System.out.printf("Marca: %s%n",this.marca);
        System.out.printf("Rodas: %d%n",this.rodas);
        System.out.printf("Cor: %s%n",this.cor);
    }
}
