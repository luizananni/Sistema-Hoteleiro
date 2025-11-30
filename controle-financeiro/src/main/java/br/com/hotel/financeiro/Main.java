package br.com.hotel.financeiro;

import java.util.Scanner;

import br.com.hotel.financeiro.boundary.BoundaryPagamento;
import br.com.hotel.financeiro.control.ControleProdutos;
import br.com.hotel.financeiro.control.ControleServicos;
import br.com.hotel.financeiro.model.CartaoCredito;
import br.com.hotel.financeiro.service.ApiPagamentoSimulada;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ControleServicos controleServicos = new ControleServicos();
        ControleProdutos controleProdutos = new ControleProdutos();
        BoundaryPagamento boundaryPagamento = new BoundaryPagamento(new ApiPagamentoSimulada());

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("===== MENU FINANCEIRO =====");
            System.out.println("1 | Lançar serviço");
            System.out.println("2 | Lançar produto");
            System.out.println("3 | Quitar diárias");
            System.out.println("4 | Avaliar hospedagem");
            System.out.println("5 | Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Numero do quarto: ");
                    int numeroQuartoServico = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do servico: ");
                    String nomeServico = scanner.nextLine();
                    System.out.print("Preco do servico: ");
                    double precoServico = scanner.nextDouble();
                    scanner.nextLine();
                    controleServicos.lancarServico(nomeServico, precoServico, numeroQuartoServico);
                    System.out.println("Serviço lancado!\n");
                    break;

                case 2:
                    System.out.print("Numero do quarto: ");
                    int numeroQuartoProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preco do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();
                    controleProdutos.lancarProduto(nomeProduto, precoProduto, numeroQuartoProduto);
                    System.out.println("Produto lancado!\n");
                    break;

                case 3:
                    double totalServicos = controleServicos.calcularValorTotal();
                    double totalProdutos = controleProdutos.calcularValorTotal();
                    double total = totalServicos + totalProdutos;

                    System.out.println("Total a pagar: R$ " + total);
                    boundaryPagamento.realizarPagamento(total, new CartaoCredito());
                    System.out.println("Pagamento processado!\n");
                    break;

                case 4:
                    System.out.print("Avaliação da hospedagem: ");
                    String texto = scanner.nextLine();
                    System.out.println("Avaliação enviada: " + texto + "\n");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida!\n");
            }
        }

        scanner.close();
    }
}