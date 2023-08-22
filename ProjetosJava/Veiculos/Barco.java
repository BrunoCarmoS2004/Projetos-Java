package ProjetosJava.Veiculos;

public class Barco extends Veiculos {
    private int capacidade, dinheiro;
    private boolean motorTipo;
    
    public Barco(int vel, int tamanho, String nome, String cor, int capacidade, boolean motorTipo, int dinheiro) {
        super(vel, tamanho, nome, cor);
        this.capacidade=capacidade;
        this.motorTipo=motorTipo;
        this.dinheiro=dinheiro;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public boolean getMotorTipo() {
        return motorTipo;
    }
    public void setMotorTipo(boolean motorTipo) {
        this.motorTipo = motorTipo;
    }
    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }
    public void info(){
        super.infoCtamanhoSmarca();
        System.out.printf("Capacidade: %d unidades\n", this.capacidade);
        System.out.print("Tipo de motor: ");
        System.out.println(this.motorTipo ?"Motor": "Vela");
        System.out.printf("dinheiro: R$ %d\n", this.dinheiro);
    }
}
