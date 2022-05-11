package aula08.ex_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main_1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa_Aluguer emp = null;
        loadingScreen();
        String nome = readStringValue("Insira o nome da empresa: ", sc);
        String email = readStringValue("Insira o email da empresa: ", sc);
        String codigo_postal = readStringValue("Insira o código-postal da empresa: ", sc);
        emp = new Empresa_Aluguer(nome, codigo_postal, email);
        boolean run = true;
        while(run){
            menuScreen();
            int choice = readIntValue("Escolha: ", sc, 0, 4);
            System.out.println();
            switch(choice){
                case 5:
                    System.out.println(emp.toString());
                    break;
                case 4:
                    break;                
                case 3:
                    System.out.println(emp.maior_distancia().toString());
                    break;
                case 2:

                    break;
                case 1:
                    Boolean run2 = true;
                    while(run2){
                        viaturaTypeMessage();
                        int opt = readIntValue("Opção?", sc, 1, 5);
                        switch(opt){
                            case 5:
                                run2 = false;
                                break;
                            case 4:
                                run2 = false;
                                break;
                            case 3:
                                run2 = false;
                                break;
                            case 2:
                                run2 = false;
                                break;
                            case 1:
                                String matricula = readStringValue("Matricula do Motociclo", sc);
                                String marca = readStringValue("Marca do Motociclo", sc);
                                String modelo = readStringValue("Modelo do Motociclo", sc);
                                int cilindrada = readIntValue("Cilindrada do Motociclo", sc, 0, Integer.MAX_VALUE);
                                String tipo = readStringValue("Tipo do Motociclo", sc);
                                Viatura moto = new Motociclo(matricula, marca, modelo, cilindrada, tipo);
                                emp.inserir_viatura(moto);
                                run2 = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 0:
                    run = false;
                    break;
                default: 
                    System.out.println("Opção errada");
                    break;
            }
        }
    
    }

    public static String readStringValue(String message, Scanner sc){
        String value;
        while (true){
            try {
                System.out.print(message);
                value = sc.next();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Looks like you shouldn't be introducing that !!!");
                sc.nextLine(); // Flush the bad input
            }
        }
        return value;
    }

    public static int readIntValue(String message, Scanner sc, int min, int max) {
        int value;
        while (true){
            try {
                System.out.print(message);
                value = sc.nextInt();
                if(value < min || value > max)
                    throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Looks like you shouldn't be introducing that !!!");
                sc.nextLine(); // Flush the bad input
            }
        }
        return value;
    }

    public static void loadingScreen(){
        System.out.println("\n########################################");
        System.out.println("##   Bem-vindo ao software de Gestão  ##");
        System.out.println("##      de uma empresa de aluger      ##");
        System.out.println("########################################\n");
    }

    public static void menuScreen(){
        System.out.println("\n########################################");
        System.out.println("##    Que operação deseja realizar?   ##");
        System.out.println("##        1 - Adicinar Viatura        ##");
        System.out.println("##        2 - Remover Viatura         ##");
        System.out.println("##        3 - Mair Distância          ##");
        System.out.println("##        4 - Adicinar Trajeto        ##");
        System.out.println("##        5 - Ver dados da empresa    ##");
        System.out.println("##        0 - Sair                    ##");
        System.out.println("########################################\n");
    }

    public static void viaturaTypeMessage(){
        System.out.println("\n########################################");
        System.out.println("##       Selecione o Veículo:         ##");
        System.out.println("##        1 - Motociclo               ##");
        System.out.println("##        2 - Automóvel Ligeiro       ##");
        System.out.println("##        3 - Táxi                    ##");
        System.out.println("##        4 - Pesado Mercadorias      ##");
        System.out.println("##        5 - Pesado Passageiros      ##");
        System.out.println("########################################\n");
    }
}
