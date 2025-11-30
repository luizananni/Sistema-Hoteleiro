package br.com.hotel.financeiro.model;

public class Produto {

    private String nome;
    private double preco;
    private int numeroQuarto;

    public Produto(String nome, double preco, int numeroQuarto) {
        this.nome = nome;
        this.preco = preco;
        this.numeroQuarto = numeroQuarto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }
}
