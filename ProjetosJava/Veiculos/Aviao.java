package ProjetosJava.Veiculos;

import java.util.Random;

public class Aviao extends Veiculos{
    Random random = new Random();
    private int asas, lugares, gasolina, pessoas;
    private float maxAltura;
    private boolean motorTipo;

    public Aviao(int vel, int tamanho, String nome, String cor, boolean motorTipo, int asas, int lugares, float maxAltura) {
        super(vel, tamanho, nome, cor);
        this.asas=asas;
        this.lugares=lugares;
        this.maxAltura=maxAltura;
        this.motorTipo=motorTipo;
        this.gasolina = random.nextInt(65) + 250;
        this.pessoas = random.nextInt(this.lugares);
    }
    
    public int getAsas() {
        return asas;
    }
    public void setAsas(int asas) {
        this.asas = asas;
    }
    public int getLugares() {
        return lugares;
    }
    public void setLugares(int lugares) {
        this.lugares = lugares;
    }
    public float getMaxAltura() {
        return maxAltura;
    }
    public void setMaxAltura(float maxAltura) {
        this.maxAltura = maxAltura;
    }
    public boolean getMotorTipo() {
        return motorTipo;
    }
    public void setMotorTipo(boolean motorTipo) {
        this.motorTipo = motorTipo;
    }
    public void info(){
        super.infoCtamanhoSmarca();
        System.out.printf("Lugares: %d%n", this.lugares);
        System.out.print("Tipo de motor: ");
        System.out.println(this.motorTipo ?"Turbina": "Helice");
        System.out.printf("Quantidade de asas: %d%n",this.asas);
        System.out.println("Altura maxima: %.2f metros");
        System.out.printf("Quantidade de gasolina do avião: %d mil litros%n",this.gasolina);
        System.out.println();
    }
    public int getGasolina() {
        return gasolina;
    }
    public int getPessoas() {
        return pessoas;
    }
}