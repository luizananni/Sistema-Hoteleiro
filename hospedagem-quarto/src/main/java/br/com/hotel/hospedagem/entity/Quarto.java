package br.com.hotel.hospedagem.entity;

public abstract class Quarto {
    public enum Status { DISPONIVEL, RESERVADO, OCUPADO, BLOQUEADO }

    protected String numero;
    protected Status status;
    protected double precoBase;

    public Quarto(String numero, double precoBase) {
        this.numero = numero;
        this.precoBase = precoBase;
        this.status = Status.DISPONIVEL;
    }

    public String getNumero() { return numero; }
    public Status getStatus() { return status; }
    public void setStatus(Status s) { this.status = s; }

    public abstract double calcularPreco(int dias);

    @Override
    public String toString() {
        return "Quarto " + numero + " (" + getClass().getSimpleName() + ") - " + status + " - R$ " + precoBase;
    }
}