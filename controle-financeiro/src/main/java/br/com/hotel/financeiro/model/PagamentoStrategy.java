package br.com.hotel.financeiro.model;

public interface PagamentoStrategy {

    double calcularDesconto(double valor);

    String getNomeMetodo();
}