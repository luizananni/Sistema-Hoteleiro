package br.com.hotel.financeiro.boundary;

import br.com.hotel.financeiro.model.PagamentoStrategy;
import br.com.hotel.financeiro.service.ApiPagamentoSimulada;

public class BoundaryPagamento {

    private ApiPagamentoSimulada api;

    public BoundaryPagamento(ApiPagamentoSimulada api) {
        this.api = api;
    }

    public void realizarPagamento(double valor, PagamentoStrategy metodo) {
        double valorFinal = metodo.calcularDesconto(valor);
        api.processar(valorFinal, metodo);
        System.out.println("Pagamento realizado: R$ " + valorFinal);
    }
}
