package ProjetosJava.Veiculos;

import java.util.Random;

public class Aviao extends Veiculos{
    Random random = new Random();
    private int asas, lugares;
    private float maxAltura;
    private boolean motorTipo;
    private int gasolina;

    
    
    
    //int randomNumber = new Random().nextInt(151) + 100;
    public Aviao(int vel, int tamanho, String nome, String cor, boolean motorTipo, int asas, int lugares, float maxAltura) {
        super(vel, tamanho, nome, cor);
        this.asas=asas;
        this.lugares=lugares;
        this.maxAltura=maxAltura;
        this.motorTipo=motorTipo;
        this.gasolina = random.nextInt(151) + 100;
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
    public void corrida(){
        //fazer funcionalidade voar chance de gasolina acabar
    }
    public int getGasolina() {
        return gasolina;
    }
    
    
}
