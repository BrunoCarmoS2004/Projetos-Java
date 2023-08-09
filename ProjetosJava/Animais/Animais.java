package ProjetosJava.Animais;

public class Animais {
    //dsad.get(x);
    private String especie;
    private float peso;
    private int idade;
    private  String sexo;
    public Animais(String especie, float peso, int idade, String sexo) {
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void info(){
        System.out.println(this.especie);
        System.out.println(this.idade);
        System.out.println(this.peso);
        System.out.println(this.sexo);
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
