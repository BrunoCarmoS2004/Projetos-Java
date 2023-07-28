package ProjetosJava.Calculadora;

import java.util.Scanner;

public class CalcMain {
    
    public static void tabela(){
        System.out.println("\n");
        System.out.println("\n"
        +"|--------------------|\n"
        +"|    Calculadora     |\n"
        +"|--------------------|\n"
        +"|1->       +      <-1|\n"
        +"|2->       -      <-2|\n"
        +"|3->       *      <-3|\n"
        +"|4->       /      <-4|\n"
        +"|5->       √      <-5|\n"
        +"|6->       ^      <-6|\n"
        +"|7->       %      <-7|\n"
        +"|--------------------|\n"
        +"|8->      Sair    <-8|\n"
        +"|--------------------|\n");
    }
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
            String resp = "0";
            
            while(!resp.equals("8") && !resp.equals("Sair") && !resp.equals("sair") && !resp.equals("SAIR"))
            {
                tabela();
                System.out.println("Escolha uma das opções acima escrevendo o Numero ou colocando o símbulo");
                System.out.print("Resposta: ");
                resp = scanner.next();
                System.out.print("\n");

                MaisMenos MaisMenos = new MaisMenos();
                PorceElevRaiz PorceElevRaiz = new PorceElevRaiz();
                VezesDivi VezesDivi = new VezesDivi();
                
                if (resp.equals("1")|| resp.equals("+"))
                {
                    MaisMenos.mais();
                }
                if (resp.equals("2")|| resp.equals("-"))
                {
                    MaisMenos.menos();
                }
                if (resp.equals("3")|| resp.equals("*"))
                {
                    VezesDivi.vezes();
                }
                if (resp.equals("4")|| resp.equals("/"))
                {
                    VezesDivi.divi();
                }
                if (resp.equals("5")|| resp.equals("√"))
                {
                    PorceElevRaiz.raiz();
                }
                if (resp.equals("6")|| resp.equals("^"))
                {
                    PorceElevRaiz.eleve();
                }
                if (resp.equals("7")|| resp.equals("%"))
                {
                    PorceElevRaiz.porcen();
                }

            
        }
    }

}

