package av2;

import java.util.ArrayList;
import java.util.Scanner;

public class Av2 {

    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList();
        ArrayList<Gato> gato = new ArrayList();
        ArrayList<Cachorro> cachorro = new ArrayList();
        
        Scanner tec = new Scanner(System.in);
        int num = 0;
        int op;
        int ordem = 0;
        int fec = 0;
        boolean status = false;
        boolean exc = false;
        
        while (fec != 1){
            if (ordem == 0 || exc == true) {
                
                while (num != 3) {
                    System.out.println("===============================================");
                    System.out.println("1 - Efetuar cadastro");
                    System.out.println("2 - Acessar seu perfil");
                    System.out.println("3 - Sair");
                    System.out.println("4 - Ir para a próxima tela");
                    System.out.println("Informe a opção desejada");
                    System.out.println("===============================================");
                    op = tec.nextInt();
                    switch (op){
                        case 1:
                            if (status == false) {
                                System.out.println("Informe seu nome");
                                String nome = tec.next();
                                System.out.println("Informe sua idade");
                                int idade = tec.nextInt();
                                System.out.println("Informe seu peso");
                                Float peso = tec.nextFloat();
                                System.out.println("Informe sua altura");
                                Float altura = tec.nextFloat();
                                lista.add(new Pessoa(nome, idade, altura, peso));
                                ordem = 1;
                                num = 3;
                                status = true;
                            } else {
                                System.out.println("Você já está cadastrado");
                            }
                            
                            break;
                        case 2:
                            for (int i = 0; i < lista.size(); i++) {
                                System.out.println(lista.get(i).toString());
                            }
                            
                        break;
                        case 3:
                            fec = 1;
                            num = 3;
                        break;
                        case 4:
                            if (status){
                                ordem = 1;
                                num = 3;
                            } else {
                                System.out.println("Você ainda não se cadastrou");
                            }
                        break;
                         default:
                            System.out.println("Opção incorreta");
                        break;
                    }
                }
            }
            if (ordem == 1) {
                while (num != 6) {  
                    System.out.println("===============================================");
                    System.out.println("Olá o que você está com vontade de fazer hoje");
                    System.out.println("1 - Comer");
                    System.out.println("2 - Andar");
                    System.out.println("3 - Ir ao petshop");
                    System.out.println("4 - Voltar para a página anterior");
                    System.out.println("5 - Ir para a próxima tela");
                    System.out.println("6 - Sair");
                    System.out.println("===============================================");
                    op = tec.nextInt();
                    switch (op){
                        case 1:
                            lista.get(0).Comer();
                        break;
                        case 2:
                            lista.get(0).Andar();
                        break;
                        case 3:
                            System.out.println("Indo ao petshop");
                            ordem = 2;
                            num = 6;
                        break;
                        case 4:
                            System.out.println("Voltando");
                            exc = true;
                            num = 6;
                            ordem = 0;
                        break;
                        case 5:
                            ordem = 2;
                            num = 6;
                        break;
                        case 6:
                            fec = 1;
                            num = 6;
                        break;
                        default:
                            System.out.println("Opção incorreta");
                        break;
                    }
                }
                }
            
            if (ordem == 2) {
                
                while (num != 7) {        
                    System.out.println("===============================================");
                    System.out.println("Você está no petshop, o que deseja fazer?");
                    System.out.println("1 - Comprar um cachorro");
                    System.out.println("2 - Comprar um gato");
                    System.out.println("3 - Ver quantos animais você tem");
                    System.out.println("4 - Devolver um gato ou cachorro");
                    System.out.println("5 - Voltar pra tela inicial");
                    System.out.println("6 - Sair");
                    System.out.println("Informe a opção desejada");
                    System.out.println("===============================================");
                    op = tec.nextInt();
                    switch (op){
                        case 1:
                            System.out.println("Informe o nome do cachorro");
                            String nome = tec.next();
                            System.out.println("Informe o sexo do cachorro");
                            String sexo = tec.next();
                            System.out.println("Informe a Cor do pelo do cachorro desejado");
                            String cor = tec.next();
                            
                            cachorro.add(new Cachorro(nome,sexo,cor));
                            
                            break;
                        case 2:
                            System.out.println("Informe o nome do gato");
                            nome = tec.next();
                            System.out.println("Informe o sexo do gato");
                            sexo = tec.next();
                            System.out.println("Informe a Cor do pelo do gato desejado");
                            cor = tec.next();
                            
                            gato.add(new Gato(nome,sexo,cor));
                            
                        break;
                        case 3:
                            System.out.println("Você tem " + (gato.size() + cachorro.size()) + " animais");
                            System.out.println("Sendo eles " + gato.size() + " gatos e " + cachorro.size() + " cachorros");
                            int n=0;
                            System.out.println("===================Cachorro===================");
                            System.out.printf("%s%2s%15s%n","Nº", "Nome", "Cor do pelo");
                            for (Cachorro dog : cachorro) {
                                n++;
                                System.out.printf("%d-%5s%15s%n", n, dog.getNome(), dog.getCorDoPelo());
                            }
                            System.out.println("===================Gato===================");
                            System.out.printf("%s%2s%15s%n","Nº", "Nome", "Cor do pelo");
                            for (Gato cat : gato) {
                                n++;
                                System.out.printf("%d-%5s%15s%n", n, cat.getNome(), cat.getCor());
                            }
                            
                        break;
                        case 4:
                            System.out.println("Informe 1 para gato, e 2 para cachorro");
                            int tipo = tec.nextInt();
                            if (tipo == 1) {
                                if (gato.isEmpty()) {
                                System.out.println("Você não tem nenhum gato no momento");
                                } else {
                                    System.out.println("Qual o nome do gato que você deseja devolver ");
                                    String busca = tec.next();

                                    for (int i = 0; i < gato.size(); i++) {
                                        Gato idGato = gato.get(i);
                                        if (idGato.getNome().equalsIgnoreCase(busca)) {
                                            System.out.println("Você tem certeza que quer devolver '" + idGato.getNome() + "'?");
                                            System.out.println("Informe 1 para 'Sim' e 2 para 'Não'");
                                            int opcao = tec.nextInt();
                                            if (opcao == 1) {
                                                gato.remove(i);
                                            } else if (opcao == 2) {
                                                System.out.println("Devolução cancelada");
                                            } else {
                                                System.out.println("Informe a opção certa");
                                            }
                                        }
                                    }
                                }
                            }
                            if (tipo == 2) {
                                if (cachorro.isEmpty()) {
                                System.out.println("Você não tem nenhum cachorro no momento");
                                } else {
                                    System.out.println("Qual o nome do cachorro que você deseja devolver ");
                                    String busca = tec.next();

                                    for (int i = 0; i < cachorro.size(); i++) {
                                        Cachorro idCachorro = cachorro.get(i);
                                        if (idCachorro.getNome().equalsIgnoreCase(busca)) {
                                            System.out.println("Você tem certeza que quer devolver '" + idCachorro.getNome() + "'?");
                                            System.out.println("Informe 1 para 'Sim' e 2 para 'Não'");
                                            int opcao = tec.nextInt();
                                            if (opcao == 1) {
                                                cachorro.remove(i);
                                            } else if (opcao == 2) {
                                                System.out.println("Devolução cancelada");
                                            } else {
                                                System.out.println("Informe a opção certa");
                                            }
                                        }
                                    }
                                }
                            }
                        break;
                        case 5:
                            exc = true;
                            num = 7;
                            ordem = 0;
                        break;
                        case 6:
                            fec = 1;
                            num = 7;
                        break;
                    
                        default:
                            System.out.println("Opção incorreta");
                        break;
                    }
                }  
            }
        }  
    }
}

       

        


