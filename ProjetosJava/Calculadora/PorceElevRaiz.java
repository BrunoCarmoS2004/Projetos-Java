package ProjetosJava.Calculadora;

public class PorceElevRaiz {
    PegarNumeros numeros = new PegarNumeros();
    public void porcen(){
        
        numeros.numeros();
        float total = 0;
        for (float number : numeros.banana) {
            total += number;
        }
        
        System.out.printf("\nA soma total dos numeros foi %.2f\n",total);
    }
    /*public void eleve(){
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
    */
}
