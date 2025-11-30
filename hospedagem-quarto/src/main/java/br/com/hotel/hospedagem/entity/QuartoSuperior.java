package br.com.hotel.hospedagem.entity;

public class QuartoSuperior extends Quarto {
    public QuartoSuperior(String numero, double precoBase) { super(numero, precoBase); }
    @Override public double calcularPreco(int dias) { return (precoBase * 1.2) * dias; }
}
