package ProjetosJava.Calculadora;

public class MaisMenos {
    
    public void mais(){
        PegarNumeros numeros = new PegarNumeros();
        numeros.numeros();
        float total = 0;
        for (int i = 0; i < numeros.vetorNumeros.length; i++) {
            total += numeros.vetorNumeros[i];
        }
        System.out.printf("A soma total dos numeros foi %d",total);
    }
    public void menos(){
        PegarNumeros numeros = new PegarNumeros();
        numeros.numeros();
        float total = 0;
        for (int i = 0; i < numeros.vetorNumeros.length; i++) {
            total -= numeros.vetorNumeros[i];
        }
        System.out.printf("A soma total dos numeros foi %d",total);
    }
}
