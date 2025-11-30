package br.com.hotel.hospedagem.boundary;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import br.com.hotel.hospedagem.controller.ControleHospedagem;
import br.com.hotel.hospedagem.entity.Hospedagem;
import br.com.hotel.hospedagem.entity.Quarto;

public class BoundaryConsole {
    private final ControleHospedagem controle;
    private final Scanner sc = new Scanner(System.in);

    public BoundaryConsole(ControleHospedagem c){ this.controle = c; }

    public void iniciarMenu(){
        while(true){
            System.out.println("\n=== Hospedagem Menu ===");
            System.out.println("1 | Listar quartos disponiveis");
            System.out.println("2 | Iniciar hospedagem");
            System.out.println("3 | Encerrar hospedagem");
            System.out.println("0 | Sair");
            System.out.print("Escolha uma opcao: ");
            String op = sc.nextLine();
            if(op.equals("0")) break;
            if(op.equals("1")) {
                List<Quarto> list = controle.exibirQuartosDisponiveis();
                list.forEach(System.out::println);
            } else if(op.equals("2")){
                System.out.print("ID hospedagem: "); String id = sc.nextLine();
                System.out.print("CPF hospede: "); String cpf = sc.nextLine();
                System.out.print("Numero quarto: "); String num = sc.nextLine();
                controle.buscarHospedagem(id).ifPresentOrElse(h->System.out.println("Ja existe"), () -> {
                    controle.buscarQuartoPorNumero(num).ifPresentOrElse(q -> {
                        System.out.print("Dias: "); int dias = Integer.parseInt(sc.nextLine());
                        Hospedagem h = controle.iniciarHospedagem(id, cpf, q, LocalDate.now(), dias);
                        System.out.println("Hospedagem iniciada: " + h.getId());
                    }, () -> System.out.println("Quarto nao encontrado."));
                });
            } else if(op.equals("3")){
                System.out.print("ID hospedagem: "); String id = sc.nextLine();
                boolean ok = controle.encerrarHospedagem(id);
                System.out.println(ok ? "Encerrada com sucesso" : "Hospedagem não encontrada");
            } else {
                System.out.println("Opção invalida.");
            }
        }
    }
}
