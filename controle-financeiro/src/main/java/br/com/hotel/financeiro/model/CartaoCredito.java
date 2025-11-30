package br.com.hotel.financeiro.model;

public class CartaoCredito implements PagamentoStrategy {

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.95; // com os 5% de desconto
    }

    @Override
    public String getNomeMetodo() {
        return "Cartao de Credito";
    }
}