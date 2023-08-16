package ProjetosJava.Veiculos;


public class Veiculos {
    // S = SEM, C = COM
    // S = SEM, C = COM
    // S = SEM, C = COM
    private int vel, rodas, tamanho;
    private String nome, marca, cor;
    private boolean motorTipo = true;
    public Veiculos(int vel, int tamanho, String nome, String cor) {
        this.vel = vel;
        this.tamanho = tamanho;
        this.nome = nome;
        this.cor = cor;
    }
    public Veiculos(int vel, String nome, String marca, String cor, int rodas) {
        this.vel = vel;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.rodas = rodas;
    }
    public Veiculos(int vel, String nome, String marca, String cor) {
        this.vel = vel;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
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

    public void infoAll(){
        System.out.println("---------------------");
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Velocidade: %d Km/h%n",this.vel);
        System.out.printf("Marca: %s%n",this.marca);
        System.out.printf("Rodas: %d%n",this.rodas);
        System.out.printf("Cor: %s%n",this.cor);
    }
    public void infoSrodas(){
        System.out.println("---------------------");
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Velocidade: %d Km/h%n",this.vel);
        System.out.printf("Marca: %s%n",this.marca);
        System.out.printf("Cor: %s%n",this.cor);
    }
    public void infoCtamanhoSmarca(){
        System.out.println("---------------------");
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Velocidade: %d Km/h%n",this.vel);
        System.out.printf("Tamanho: %d metros%n",this.tamanho);
        System.out.printf("Cor: %s%n",this.cor);
    }
}
