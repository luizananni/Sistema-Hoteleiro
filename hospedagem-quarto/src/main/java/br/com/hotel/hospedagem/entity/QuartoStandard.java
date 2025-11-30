package br.com.hotel.hospedagem.entity;

public class QuartoStandard extends Quarto {
    public QuartoStandard(String numero, double precoBase) { super(numero, precoBase); }
    @Override public double calcularPreco(int dias) { return precoBase * dias; }
}