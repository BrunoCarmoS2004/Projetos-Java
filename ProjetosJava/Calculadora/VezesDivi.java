package ProjetosJava.Calculadora;

public class VezesDivi {
    PegarNumeros numeros = new PegarNumeros();
    public void vezes(){
        int num = 1;
        int raiz = 0;
        numeros.numeros(raiz);
        float total = 0;
        for (float number : numeros.banana) {
            if (num == 1){
                total += number;
                num++;
            }else{
                total *= number;
                
            }
            
        }
        
        System.out.printf("\nO Resultado é %.2f\n",total);
    }
    public void divi(){
        int num = 1;
        int raiz = 0;
        numeros.numeros(raiz);
        float total = 0;
        for (float number : numeros.banana) {
            if (num == 1){
                total += number;
                num++;
            }else{
                total /= number;
                
            }
            
        }
        
        System.out.printf("\nO Resultado é %.2f\n",total);
    }
    
}
