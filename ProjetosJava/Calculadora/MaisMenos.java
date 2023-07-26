package ProjetosJava.Calculadora;

public class MaisMenos {
    
    public static void mais(){
        PegarNumeros numeros = new PegarNumeros();
        numeros.numeros();
        float total = 0;
        for (int i = 0; i < numeros.num; i++) {
            System.out.println(numeros.vetorNumeros[i]);
            total += (float)numeros.vetorNumeros[i];
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        mais();
    }
}
