package ProjetosJava.Veiculos;

public class Barco extends Veiculos {
    private int capacidade;
    private boolean motorTipo;
    public Barco(int vel, int tamanho, String nome, String cor, int capacidade, boolean motorTipo) {
        super(vel, tamanho, nome, cor);
        this.capacidade=capacidade;
        this.motorTipo=motorTipo;
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
    
    public void info(){
        super.infoCtamanhoSmarca();
        System.out.printf("Capacidade: %d Kg\n", this.capacidade);
        System.out.print("Tipo de motor: ");
        System.out.println(this.motorTipo ?"Motor": "Vela");
        System.out.println();
    }
    public void pescar(){
        //fazer funcionalidade de pescar
    }
}
