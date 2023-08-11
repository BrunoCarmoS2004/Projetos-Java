package ProjetosJava.Veiculos;

public class Veiculos {
    private int vel;
    private String nome;
    private String marca;
    private String cor;
    private int rodas;
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
}
