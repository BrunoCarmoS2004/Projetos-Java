package ProjetosJava.Veiculos;

import java.util.Scanner;

public class TelaMainVeic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha1 = 5, escolha2 = 5, respVel, respRodas, respPortas, respHetsed;
        String respNome, respCor, respMarca, respStilo;
        float respZerocem;




        System.out.println("Bem vindo a garagem C-137");
        System.out.println("Aqui você poderam adicionar, modificar, excluir e apostar corrida com carros, motos, aviões ou barcos!");
        System.out.println("Escolha uma das opções da tebela abaixo");
        while (escolha1 !=0 ){
            System.out.println("----------\n"
            +"1 - Carro\n"
            +"2 - Motos\n"
            +"3 - Avião\n"
            +"4 - Barco\n"
            +"0 - Sair\n"
            +"---------");
            escolha1 = scanner.nextInt();
            switch(escolha1){
                case 1:
                while(true){
                    System.out.println("1 - Adicionar Carro\n"
                    +"2 - Modificar Carro\n"
                    +"3 - Excluir Carro\n"
                    +"4 - Apostar Corrida entre os carros\n"
                    +"0 - Voltar\n");
                    escolha2 = scanner.nextInt();
                    if(escolha2 == 1){
                        //Adicionar carros;
                        System.out.print("Digite o nome do carro: \n");
                        respNome = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a velocidade: \n");
                        respVel = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Marca do carro: \n");
                        respMarca = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Cor do carro: \n");
                        respCor = scanner.next();
                        System.out.print("Agora digite o estilo do carro 1 = Hetch, 2 = Sedan, 3 = SUV: \n");
                        respHetsed = scanner.nextInt();
                        if(respVel == 1){
                            respStilo="Hetch";
                        }else if(respVel == 2){
                            respStilo = "Sedan";
                        }else if(respVel == 3){
                            respStilo = "SUV";
                        }else{
                            respStilo= "Não Especificado";
                        }
                        System.out.println("Pronto");
                        System.out.print("Agora digite a quantidade de rodas do carro: \n");
                        respRodas = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a quantidade de portas do carro: \n");
                        respPortas = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite o tempo que o carro faz de 0 a 100 em segundos: \n");
                        respZerocem = scanner.nextFloat();
                        System.out.println("Pronto");
                        Carros carro1 = new Carros(respVel, respNome, respMarca, respCor, respRodas, respPortas, respStilo, respZerocem);
                        System.out.println("As informações do carro são: ");
                        carro1.info();
                    }else if(escolha1 == 2){
                        //Modificar carro
                    }else if(escolha1 == 3){
                        //Excluir carro
                    }else if(escolha1 == 4){
                        //Corrida
                    }else if(escolha1 == 0){
                        break;
                    }
                }
            } 
        }
    }
}
