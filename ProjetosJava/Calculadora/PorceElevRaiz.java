package ProjetosJava.Calculadora;

public class PorceElevRaiz {
    PegarNumeros numeros = new PegarNumeros();
    public void porcen(){
        int num = 1;
        int raiz = 0;
        numeros.numeros(raiz);
        float total = 0;
        for (float number : numeros.banana) {
            if (num == 1){
                total += number;
                num++;
            }else{
                total = total/100;

                total *= number;
                
            }
            
        }
        System.out.printf("\nO resultado da conta foi %.2f\n",total);
    }
        
    public void eleve(){
        int num = 1;
        int raiz = 2;
        numeros.numeros(raiz);
        float total = 0;
        float aaa = 0;
        for (float number : numeros.banana) {
            if (num == 1){
                aaa+=number;
                num++;
            }else{
                total += number;
                total = (float) Math.pow(aaa, number);
                
            }
            
        }
        System.out.printf("\nO resultado da conta foi %.2f\n",total);
        raiz = 0;
    }
    
    public void raiz(){
        int raiz = 1;
        numeros.numeros(raiz);
        float total = 0;
        float num = 0;
        int num2 = 0;
        if(num2 == 0){
            for (float number : numeros.banana) {
                num +=number;
                total += number;
            }
            total = (float) Math.sqrt(total);
            System.out.printf("\nA raiz do numero %.2f é: %.2f\n",num, total);
            raiz = 0;
        }
        
    }
}
