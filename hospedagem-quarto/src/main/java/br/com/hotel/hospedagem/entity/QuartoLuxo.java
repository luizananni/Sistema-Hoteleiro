package br.com.hotel.hospedagem.entity;

public class QuartoLuxo extends Quarto {
    public QuartoLuxo(String numero, double precoBase) { super(numero, precoBase); }
    @Override public double calcularPreco(int dias) { return (precoBase * 1.5) * dias; }
}
