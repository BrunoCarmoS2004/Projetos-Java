package ProjetosJava.Veiculos;

import java.util.Scanner;
import java.util.Random;
public class TelaMainVeic {
    public static void main(String[] args) {

        /*Os vetores nos objetos NÃO foram feitos com base em códigos prontos de inteligencia artificiais, quando eu li o desafio um tempo depois eu pensei em vetores nos objetos, (vetores a gente ja aprendeu e objetos tbm) agora só precisava juntar os dois, então vi esse video. 

        https://www.youtube.com/watch?v=Y3wcF_Sobrk 
        
        Adaptei TOTALMENTE para meu código, se vc não considerar isso, pelo menos considere que antes de ter o vetor eu ja tinha feito TUDO do jeito padrão sem vetor
        
         As funcionalidades de Corrida, Voar, Pescar não estão nas classes por que ainda não descobri/não tive tempo de como chamar o objeto VETOR da main nas classes*/



        Scanner scanner = new Scanner(System.in);
        int i= 0, escolha1 = 5, escolha2 = 5, escolha3 = 5, respVel, respRodas, respPortas, respHetsed, respBool, respTam, respAsas, respLugares, respTamVet, corridaVel = 0, n=1, corridaAleat, respCidade, respId, respCapacidade = 0, dinheiro = 0, numPeixes = 0, qtdPeixes =0, pescaAleat;
        String respNome, respCor, respMarca, respStilo, corridaNome = "";
        float respZerocem, respMaxAltura;
        boolean respMotorTipo = true;
        int[] capacidade1;
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
                    n++;
                    System.out.println("Pronto");
                    System.out.print("Agora digite a velocidade: \n");
                    respVel = scanner.nextInt();
                    System.out.println("Pronto");
                    System.out.print("Agora digite a Marca do carro: \n");
                    respMarca = scanner.next();
                    System.out.println("Pronto");
                    System.out.print("Agora digite a Cor do carro: \n");
                    respCor = scanner.next();
                    System.out.print("Agora digite o estilo do carro 1 = Retch, 2 = Sedan, 3 = SUV: \n");
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
                                    corridaAleat = random.nextInt(20);
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
                                        System.out.println("As informações dos aviões "+--n+" são: ");
                                        n++;
                                        aviao1[i].info();
                                        System.out.println();
                                    }  
                                    break;
                                case 2:
                                    System.out.println("Escolha o ID de um dos aviões: ");
                                    n = 0;
                                    for (i=0; i<aviao1.length; i ++){
                                        System.out.printf("Id: %d - ",n );
                                        System.out.println(aviao1[i].getNome());
                                        System.out.println("Gasolina: "+ aviao1[i].getGasolina());
                                        System.out.println();
                                        n++;
                                    }
                                    respId = scanner.nextInt();
                                    System.out.println("Agora escolha a cidade: ");
                                    System.out.println("1 - São Pauloo\n"
                                    +"2 - Rio de Janeiro\n"
                                    +"3 - Belo Horizonte\n"
                                    +"4 - Rio Branco (Acre)\n");
                                    respCidade = scanner.nextInt();
                                    if(respCidade == 1 && aviao1[respId].getGasolina() >= 64){
                                        System.out.println("\nParabéns o avião"+aviao1[respId].getNome()+" Chegou em São Paulo\n");
                                    }
                                    else if (respCidade == 1 && aviao1[respId].getGasolina() < 64){
                                        System.out.println("\nNão faço a minima ideia de como, mas ele caiu!\n");
                                        System.out.println("\nUm total de "+aviao1[respId].getPessoas()+" morreram, parabens por usas escolhas\n");
                                    }
                                    else if(respCidade == 2 && aviao1[respId].getGasolina() >= 126){
                                        System.out.println("\nParabéns o avião"+aviao1[respId].getNome()+" Chegou no Rio de Janeiro\n");
                                    }
                                    else if (respCidade == 2 && aviao1[respId].getGasolina() < 126){
                                        System.out.println("\nInfelizmente, por causas aleatórias o avião não chegou no Rio de Janeiro(Ele caiu :()\n");
                                        System.out.println("\nUm total de "+aviao1[respId].getPessoas()+" morreram, parabens por usas escolhas\n");
                                    }
                                    else if(respCidade == 3 && aviao1[respId].getGasolina() >= 188){
                                        System.out.println("\nParabéns o avião"+aviao1[respId].getNome()+" Chegou em Belo Horizonte\n");
                                    }
                                    else if (respCidade == 3 && aviao1[respId].getGasolina() < 188){
                                        System.out.println("\nInfelizmente, por causas aleatórias a compania esqueceu de abastecer o avião e vc ja sabe o resto...\n");
                                        System.out.println("\nUm total de "+aviao1[respId].getPessoas()+" morreram, parabens por usas escolhas\n");
                                    }
                                    else if(respCidade == 4 && aviao1[respId].getGasolina() >= 230){
                                        System.out.println("\nParabéns o avião "+aviao1[respId].getNome()+" Chegou na Ilha do Jurassic Park Rio Branco(ACRE)\n");
                                    }
                                    else if (respCidade == 4 && aviao1[respId].getGasolina() < 230){
                                        System.out.println("\nInfelizmente, por causas aleatórias(Um Pterodáctilo) o avião caiu, isso que da ser rico e ir querer ir desbravar uma ilha de dinossauros!\n");
                                        System.out.println("\nUm total de "+aviao1[respId].getPessoas()+" morreram, parabens por usas escolhas\n");
                                    }
                                    break;
                            }  
                            if (escolha3 == 0){
                                break;
                            }
                        }   
                    break;
                case 3:
//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco//Barco
                    System.out.println("Digite a quantidade de barcos que deseja adicionar");
                    respTamVet = scanner.nextInt();
                    Barco[] barco1 = new Barco[respTamVet];
                    capacidade1 = new int[respTamVet];
                    //Adicionar barcos;
                    for (i = 0; i < barco1.length; i++) {
                        System.out.print("Digite o nome do barco: \n");
                        respNome = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Digite a capacidade de carga do barco: \n");
                        respCapacidade = scanner.nextInt();
                        capacidade1[i] = respCapacidade;
                        System.out.println("Pronto");
                        System.out.print("Agora digite a velocidade: \n");
                        respVel = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite o tamanho do barco: \n");
                        respTam = scanner.nextInt();
                        System.out.println("Pronto");
                        System.out.print("Agora digite a Cor do barco: \n");
                        respCor = scanner.next();
                        System.out.println("Pronto");
                        System.out.print("Agora digite o tipo de locomoção do barco: 1-Motor, 2-Vela\n");
                        respBool = scanner.nextInt();
                        if(respBool == 1){
                            respMotorTipo=true;
                        }else if(respBool == 2){
                            respMotorTipo = false;
                        }
                        System.out.println("Pronto");
                        barco1[i] = new Barco(respVel, respTam, respNome, respCor, respCapacidade, respMotorTipo, dinheiro);
                        barco1[i].setCapacidade(respCapacidade);
                    }
                    while (true){
                        System.out.println("1 - Mostrar informações dos barcos\n"
                        +"2 - Pescar em alto mar\n"
                        +"0 - Voltar/Reiniciar barcos\n");
                        System.out.print("Escolha uma das opções a cima: ");
                        escolha3 = scanner.nextInt();
                        System.out.println();
                        switch(escolha3){
                            case 1: 
                                for(i=0;i<barco1.length; i++){
                                    System.out.println("As informações dos barcos "+--n+" são: ");
                                    n++;
                                    barco1[i].info();
                                    System.out.println();
                                }
                                break;
                            case 2:
                                System.out.println("Escolha o ID de um dos barcos: ");
                                n = 0;
                                for (i=0; i<barco1.length; i ++){
                                    System.out.printf("Id: %d - ",n );
                                    System.out.println(barco1[i].getNome());
                                    System.out.println("Capacidade: "+ barco1[i].getCapacidade());
                                    System.out.println();
                                    n++;
                            }
                            respId = scanner.nextInt();
                                System.out.println("\nVocê esta no em alto mar\n");
                                qtdPeixes = 0;
                                for (i = 0; i < capacidade1[respId]; i++) {
                                    numPeixes = 0;
                                    pescaAleat = random.nextInt(250);
                                    if(pescaAleat <= 50 && barco1[respId].getCapacidade() >=1){
                                        qtdPeixes +=1;
                                        numPeixes +=1;
                                        barco1[respId].setCapacidade(barco1[respId].getCapacidade() - numPeixes);
                                    }
                                }
                                barco1[respId].setCapacidade(barco1[respId].getCapacidade() - qtdPeixes);
                                System.out.println("\nParabéns você pegou "+qtdPeixes+" peixe(s) bem grande(s)!\n");
                                while(true){
                                    System.out.println("\nO que deseja fazer agora?\n");
                                    System.out.println("1 - Vender os peixes\n"
                                    +"2 - Pescar mais\n"
                                    +"3 - Ver informações do barco\n"
                                    +"0 - Voltar");
                                    escolha2 = scanner.nextInt();
                                    if (escolha2 == 1){
                                        dinheiro += qtdPeixes * 13;
                                        barco1[respId].setDinheiro(dinheiro);
                                        System.out.println("Voce vendeu tudo e ganhou R$ "+dinheiro);
                                    }
                                    else if(escolha2 == 2){
                                        if(barco1[respId].getCapacidade() <= 0){
                                            System.out.println("Você não tem espaço sufiente");
                                        }else{
                                            System.out.println("\nVocê esta no em alto mar\n");
                                            qtdPeixes = 0;
                                            for (i = 0; i < capacidade1[respId]; i++) {
                                                numPeixes = 0;
                                                pescaAleat = random.nextInt(250);
                                                if(pescaAleat <= 50 && barco1[respId].getCapacidade() >=1){
                                                    qtdPeixes +=1;
                                                    numPeixes +=1;
                                                    barco1[respId].setCapacidade(barco1[respId].getCapacidade() - numPeixes);
                                                }
                                            }
                                            System.out.println("\nParabéns você pegou "+qtdPeixes+" peixe(s) bem grande(s)!\n");
                                        }
                                    }else if(escolha2 == 3){
                                        for(i=0;i<1; i++){
                                            System.out.println("As informações dos barcos "+--n+" são: ");
                                            n++;
                                            barco1[i].info();
                                            System.out.println();
                                        }
                                    }
                                    else if (escolha2 == 0){
                                        break;
                                    }
                                }
                        }   
                        if (escolha3 == 0){
                            break;
                        }
                    }
                break;
            }
        }
    }
}   