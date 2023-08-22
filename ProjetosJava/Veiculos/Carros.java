package ProjetosJava.Veiculos;
import java.util.Random;
public class Carros extends Veiculos {
    private int portas;
    private String hetsed;
    private float zerocem;
    Random random = new Random();

    public Carros(int vel, String nome, String marca, String cor, int rodas, int portas, String hetsed, float zerocem) {
        super(vel, nome, marca, cor, rodas);
        this.portas = portas;
        this.hetsed= hetsed;
        this.zerocem = zerocem;
    }
    
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getHetsed() {
        return hetsed;
    }
    public void setHetsed(String hetsed) {
        this.hetsed = hetsed;
    }
    public float getZerocem() {
        return zerocem;
    }
    public void setZerocem(float zerocem) {
        this.zerocem = zerocem;
    }

    public void info(){
        super.infoAll();
        System.out.printf("Portas: %d%n",this.portas);
        System.out.printf("Estilo: %s%n",this.hetsed);
        System.out.printf("De zero a Cem: %.2f segundos%n",this.zerocem);
        System.out.println("---------------------------");
    }
}
