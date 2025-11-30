package br.com.hotel.financeiro.service;

import br.com.hotel.financeiro.model.PagamentoStrategy;

public class ApiPagamentoSimulada {

    public void processar(double valor, PagamentoStrategy metodo) {
        System.out.println("Enviando dados para empresa terceirizada: " + metodo.getNomeMetodo() + " - R$ " + valor);
    }
}