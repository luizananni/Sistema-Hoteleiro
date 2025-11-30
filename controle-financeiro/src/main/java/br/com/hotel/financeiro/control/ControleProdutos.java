package br.com.hotel.financeiro.control;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.financeiro.model.Produto;

public class ControleProdutos {

    private List<Produto> produtos = new ArrayList<>();

    public void lancarProduto(String nome, double preco, int numeroQuarto) {
        produtos.add(new Produto(nome, preco, numeroQuarto));
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}