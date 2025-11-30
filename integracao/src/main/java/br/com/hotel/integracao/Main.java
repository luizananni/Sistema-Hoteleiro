package br.com.hotel.integracao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n======== SISTEMA INTEGRADO DO HOTEL ========");
            System.out.println("1 | Cadastro de Hospedes");
            System.out.println("2 | Hospedagem e Quartos");
            System.out.println("3 | Financeiro");
            System.out.println("0 | Sair");
            System.out.print("Escolha uma opcao: ");

            int op = sc.nextInt();
            switch (op) {

                case 1:
                    br.com.hotel.cadastro.Main.main(null);  
                    break;

                case 2:
                    br.com.hotel.hospedagem.Main.main(null);
                    break;

                case 3:
                    br.com.hotel.financeiro.Main.main(null);
                    break;

                case 0:
                    System.out.println("Sistema finalizado.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
}