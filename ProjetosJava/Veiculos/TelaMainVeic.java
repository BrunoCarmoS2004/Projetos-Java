package ProjetosJava.Veiculos;

import java.util.Scanner;
import java.util.Random;
public class TelaMainVeic {
    public static void main(String[] args) {

        /*Os vetores nos objetos NÃO foram feitos com base em códigos prontos de inteligencia artificiais, quando eu li o desafio um tempo depois eu pensei em vetores nos objetos, (vetores a gente ja aprendeu e objetos tbm) agora só precisava juntar os dois, então vi esse video. 

        https://www.youtube.com/watch?v=Y3wcF_Sobrk 
        
        Adaptei TOTALMENTE para meu código, se vc não considerar isso, pelo menos considere que antes de ter o vetor eu ja tinha feito TUDO do jeito padrão sem vetor*/



        Scanner scanner = new Scanner(System.in);
        int escolha1 = 5, escolha2 = 5, escolha3 = 5, respVel, respRodas, respPortas, respHetsed, respCilin, respBool, respCap, respTam, respAsas, respLugares, respTamVet, corridaVel = 0, n=1, corridaAleat, respCidade, respAviao;
        String respNome, respCor, respMarca, respStilo, corridaNome = "";
        float respZerocem, respMaxAltura;
        int i = 0;
        boolean respGrau = true, respBarul= true, respMotorTipo = true;
        


        Random random = new Random();
        
        System.out.println("Bem vindo a garagem C-137");
        System.out.println("Aqui você poderam adicionar, carros, motos, aviões ou barcos!");
        System.out.println("Escolha uma das opções da tebela abaixo");
        while (escolha1 !=0 ){
            System.out.println("----------------------\n"
            +"1 - Carro\n"
            +"2 - Avião\n"
            +"3 - Barco\n"
            +"0 - Sair\n"
            +"---------------------");
            escolha1 = scanner.nextInt();
            switch(escolha1){
//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro//Carro
                case 1:
                    System.out.println("Digite a quantidade de carros que deseja adicionar");
                    respTamVet = scanner.nextInt();
                    Carros[] carro1 = new Carros[respTamVet];

                    for (i = 0; i < carro1.length; i++) {
                        
                    System.out.print("Digite o nome do "+n+"° carro: \n");
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
                    if(respHetsed == 1){
                        respStilo="Hetch";
                    }else if(respHetsed == 2){
                        respStilo = "Sedan";
                    }else if(respHetsed == 3){
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
                    carro1[i] = new Carros(respVel, respNome, respMarca, respCor, respRodas, respPortas, respStilo, respZerocem);
                    System.out.println();
                    }
                    
                    /*
                    */
                    while (true){
                        System.out.println("1 - Mostrar informações dos carros \n"
                        +"2 - Apostar corrida com os carros\n"
                        +"0 - Voltar/Reiniciar carros\n");
                        System.out.print("Escolha uma das opções a cima: ");
                        escolha3 = scanner.nextInt();
                        System.out.println();
                        switch(escolha3){
                            case 1:
                            n=1;
                                for( i = 0; i< carro1.length; i++){
                                    System.out.println("As informações dos carros "+n+" são: ");
                                    n++;
                                    carro1[i].info();
                                    System.out.println();
                                }  
                                break;
                            case 2:
                                for (i = 0; i < carro1.length; i++) {
                                    corridaAleat = random.nextInt(10);
                                    if(carro1[i].getVel()>corridaVel){
                                        corridaVel = carro1[i].getVel();
                                        corridaNome = carro1[i].getNome();
                                    }else if (carro1[i].getVel()<corridaVel && corridaAleat <= 3){
                                        corridaVel = carro1[i].getVel();
                                        corridaNome = carro1[i].getNome();
                                    }
                                }
                                System.out.println("O "+corridaNome+" ganhou a corrida");
                                System.out.println();
                                break;
                        }  
                        if (escolha3 == 0){
                            break;
                        }
                        
                    }   
                break;
                
//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO//AVIÃO
                case 2:
                    //AVIÃO
                    System.out.println("Digite a quantidade de aviões que deseja adicionar");
                    respTamVet = scanner.nextInt();
                    Aviao[] aviao1 = new Aviao[respTamVet];
                        //Adicionar barcos;
                        for (i = 0; i < aviao1.length; i++) {
                            System.out.print("Digite o nome do avião: \n");
                            respNome = scanner.next();
                            System.out.println("Pronto");
                            System.out.print("Digite a quantidade de lugares do avião: \n");
                            respLugares = scanner.nextInt();
                            System.out.println("Pronto");
                            System.out.print("Agora digite a velocidade: \n");
                            respVel = scanner.nextInt();
                            System.out.println("Pronto");
                            System.out.print("Agora digite o tamanho do avião: \n");
                            respTam = scanner.nextInt();
                            System.out.println("Pronto");
                            System.out.print("Agora digite a quantidade de asas do avião: \n");
                            respAsas = scanner.nextInt();
                            System.out.println("Pronto");
                            System.out.print("Agora digite a Cor do avião: \n");
                            respCor = scanner.next();
                            System.out.println("Pronto");
                            System.out.print("Agora digite a altura maxima que ele pode chegar: \n");
                            respMaxAltura = scanner.nextFloat();
                            System.out.println("Pronto");
                            System.out.print("Agora digite o tipo de locomoção do barco: 1-Turbina, 2-Helice\n");
                            respBool = scanner.nextInt();
                            if(respBool == 1){
                                respMotorTipo=true;
                            }else if(respBool == 2){
                                respMotorTipo = false;
                            }
                            System.out.println("Pronto");
                            aviao1[i] = new Aviao(respVel, respTam, respNome, respCor, respMotorTipo, respAsas, respLugares, respMaxAltura);
                        }
                        //MUDAR TUDO KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
                        while (true){
                            System.out.println("1 - Mostrar informações dos aviões \n"
                            +"2 - Voar até um local(veja o numero um dos aviões, de 0 até "+respTamVet+"\n"
                            +"0 - Voltar/Reiniciar aviões\n");
                            System.out.print("Escolha uma das opções a cima: ");
                            escolha3 = scanner.nextInt();
                            System.out.println();
                            switch(escolha3){
                                case 1:
                                n=1;
                                    for( i = 0; i< aviao1.length; i++){
                                        System.out.println("As informações dos aviões "+n+" são: ");
                                        n++;
                                        aviao1[i].info();
                                        System.out.println();
                                    }  
                                    break;
                                case 2:
                                    System.out.println("Escolha o ID de um dos aviões: ");
                                    n = 0;
                                    for (i=0; i<aviao1.length; i ++){
                                        System.out.printf("Id: %d",n );
                                        System.out.println(aviao1[i].getNome());
                                        System.out.println(aviao1[i].getGasolina());
                                        n++;
                                    }
                                    respAviao = scanner.nextInt();
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("Agora escolha a cidade: ");
                                    System.out.println("1 - Rio de Janeiro\n"
                                    +"2 - São Paulo\n"
                                    +"3 - Rio Branco (Acre)\n"
                                    +"4 - Belo Horizonte\n");
                                    respCidade = scanner.nextInt();
                                    if(respCidade == 1)
                                    break;
                            }  
                            if (escolha3 == 0){
                                break;
                            }
                            
                        }   
                        
                    break;




                case 3:
                while(true){
                    System.out.println("1 - Adicionar Barco\n"
                    +"0 - Voltar\n");
                    escolha2 = scanner.nextInt();
                    if(escolha2 == 1){
                        //Adicionar barcos;
                        System.out.print("Digite o nome do barco: \n");
                        respNome = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Digite a Capacidade do barco: \n");
                        respCap = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a velocidade: \n");
                        respVel = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite o tamanho do barco: \n");
                        respTam = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Cor do barco: \n");
                        respCor = scanner.next();
                        System.out.print("Agora digite o tipo de locomoção do barco: 1-Motor, 2-Vela\n");
                        respBool = scanner.nextInt();
                        if(respBool == 1){
                            respMotorTipo=true;
                        }else if(respBool == 2){
                            respMotorTipo = false;
                        }
                        System.out.println("Pronto");
                        Barco barco1 = new Barco(respVel, respTam, respNome, respCor, respCap, respMotorTipo);
                        System.out.println("As informações do barco são: ");
                        barco1.info();
                    }else if(escolha2 == 0){
                        break;
                    }
                }
                break;
            } 
        }
    }
}