package br.com.hotel.financeiro.control;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.financeiro.model.Servico;

public class ControleServicos {

    private List<Servico> servicos = new ArrayList<>();

    public void lancarServico(String nome, double preco, int numeroQuarto) {
        servicos.add(new Servico(nome, preco, numeroQuarto));
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Servico s : servicos) {
            total += s.getPreco();
        }
        return total;
    }

    public List<Servico> getServicos() {
        return servicos;
    }
}