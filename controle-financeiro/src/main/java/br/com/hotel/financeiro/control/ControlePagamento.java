package br.com.hotel.financeiro.control;

import br.com.hotel.financeiro.model.PagamentoStrategy;

public class ControlePagamento {

    public double processarPagamento(double valorTotal, PagamentoStrategy strategy) {
        return strategy.calcularDesconto(valorTotal);
    }
}