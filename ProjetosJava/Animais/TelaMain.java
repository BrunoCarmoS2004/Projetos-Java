package ProjetosJava.Animais;

public class TelaMain {
    public static void main(String[] args) {
        String teste;
        Animais animal = new Animais("Gabriel", 5, 18, "muito gay");
        animal.setIdade(28);
        animal.info();
    }
}
