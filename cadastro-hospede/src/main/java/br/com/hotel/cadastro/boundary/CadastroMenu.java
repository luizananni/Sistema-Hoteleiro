package br.com.hotel.cadastro.boundary;

import java.util.Scanner;

import br.com.hotel.cadastro.controller.CadastroHospedeController;
import br.com.hotel.cadastro.entity.Hospede;

public class CadastroMenu {

    private CadastroHospedeController controller = new CadastroHospedeController();
    private Scanner sc = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("\n--- MENU CADASTRO DE HOSPEDES ---");
            System.out.println("1 | Cadastrar Hospede");
            System.out.println("2 | Buscar por CPF");
            System.out.println("3 | Listar Todos");
            System.out.println("0 | Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> buscar();
                case 3 -> listar();
            }
        } while (opcao != 0);
    }

    private void cadastrar() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF (11 digitos): ");
        String cpf = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String tel = sc.nextLine();

        controller.cadastrar(new Hospede(nome, cpf, email, tel));

        System.out.println("Hospede cadastrado com sucesso!");
    }

    private void buscar() {
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        Hospede h = controller.buscarPorCpf(cpf);

        if (h == null) {
            System.out.println("Hospede não encontrado.");
        } else {
            System.out.println(h);
        }
    }

    private void listar() {
        controller.listarTodos().forEach(System.out::println);
    }
}