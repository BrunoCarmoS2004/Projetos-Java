package ProjetosJava.Calculadora;

public class MaisMenos {
    PegarNumeros numeros = new PegarNumeros();
    public void mais(){
        
        numeros.numeros();
        float total = 0;
        for (float number : numeros.banana) {
            total += number;
        }
        
        System.out.printf("\nA soma total dos numeros foi %.2f\n",total);
    }
    public void menos(){
        int num = 1;
        numeros.numeros();
        float total = 0;
        for (float number : numeros.banana) {
            if (num == 1){
                total += number;
                num++;
            }else{
                total -= number;
                
            }
            
        }
        System.out.printf("\nO resultado da conta foi %.2f\n",total);
    }
    
}
