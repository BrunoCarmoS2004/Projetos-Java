package ProjetosJava.Veiculos;

import java.util.Scanner;

public class TelaMainVeic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha1 = 5, escolha2 = 5, respVel, respRodas, respPortas, respHetsed, respCilin, respBool, respCap, respTam, respAsas, respLugares;
        String respNome, respCor, respMarca, respStilo;
        float respZerocem, respMaxAltura;
        boolean respGrau = true, respBarul= true, respMotorTipo = true;
        



        System.out.println("Bem vindo a garagem C-137");
        System.out.println("Aqui você poderam adicionar, carros, motos, aviões ou barcos!");
        System.out.println("Escolha uma das opções da tebela abaixo");
        while (escolha1 !=0 ){
            System.out.println("----------------------\n"
            +"1 - Carro\n"
            +"2 - Motos\n"
            +"3 - Avião\n"
            +"4 - Barco\n"
            +"5 - Listar Veiculos\n"
            +"0 - Sair\n"
            +"---------------------");
            escolha1 = scanner.nextInt();
            switch(escolha1){
                case 1:
                while(true){
                    System.out.println("1 - Adicionar Carro\n"
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
                        Carros carro1 = new Carros(respVel, respNome, respMarca, respCor, respRodas, respPortas, respStilo, respZerocem);
                        System.out.println("As informações do carro são: ");
                        carro1.info();
                    }else if(escolha2 == 0){
                        break;
                    }
                }
                break;
                case 2:
                while(true){
                    System.out.println("1 - Adicionar Moto\n"
                    +"0 - Voltar\n");
                    escolha2 = scanner.nextInt();
                    if(escolha2 == 1){
                        //Adicionar carros;
                        System.out.print("Digite o nome da Moto: \n");
                        respNome = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Digite a Cilindrada da Moto: \n");
                        respCilin = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a velocidade: \n");
                        respVel = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Marca da Moto: \n");
                        respMarca = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Cor da Moto: \n");
                        respCor = scanner.next();
                        System.out.print("Agora digite se a Moto da Grau: 1-Sim, 2-Não\n");
                        respBool = scanner.nextInt();
                        if(respBool == 1){
                            respGrau=true;
                        }else if(respBool == 2){
                            respGrau = false;
                        }
                        System.out.println("Pronto");
                        System.out.print("Agora digite se a Moto faz barulho: 1-Sim, 2-Não\n");
                        respBool = scanner.nextInt();
                        if(respBool == 1){
                            respBarul= true;
                        }else if(respBool == 2){
                            respBarul = false;
                        }
                        System.out.println("Pronto");
                        Motos moto1 = new Motos(respVel, respNome, respMarca, respCor, respCilin, respBarul, respGrau);
                        System.out.println("As informações da Moto são: ");
                        moto1.info();
                    }else if(escolha2 == 0){
                        break;
                    }
                }
                break;
                case 3:
                    //AVIÃO
                    while(true){
                        System.out.println("1 - Adicionar Avião\n"
                        +"0 - Voltar\n");
                        escolha2 = scanner.nextInt();
                        if(escolha2 == 1){
                            //Adicionar barcos;
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
                            Aviao aviao1 = new Aviao(respVel, respTam, respNome, respCor, respMotorTipo, respAsas, respLugares, respMaxAltura);
                            System.out.println("As informações do barco são: ");
                            aviao1.info();
                        }else if(escolha2 == 0){
                            break;
                        }
                    }
                    break;
                case 4:
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