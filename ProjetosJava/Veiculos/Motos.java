package ProjetosJava.Veiculos;



public class Motos extends Veiculos {
    private int cilin;
    private boolean barul;
    private boolean grau;
    public Motos(int vel, String nome, String marca, String cor, int rodas, int cilin, boolean barul, boolean grau) {
        super(vel, nome, marca, cor, rodas);
        this.barul= barul;
        this.cilin=cilin;
        this.grau=grau;
    }
    public int getCilin() {
        return cilin;
    }
    public void setCilin(int cilin) {
        this.cilin = cilin;
    }
    public boolean isBarul() {
        return barul;
    }
    public void setBarul(boolean barul) {
        this.barul = barul;
    }
    public boolean isGrau() {
        return grau;
    }
    public void setGrau(boolean grau) {
        this.grau = grau;
    }

    public void info(){
        super.info();
        System.out.printf("%d Cilindadas\n", cilin);
        System.out.print("Faz barulho? ");
        System.out.println(barul ?"Sim": "Não");
        System.out.print("Da grau? ");
        System.out.println(grau ?"Sim": "Não");
        System.out.println();
    }
    
}
