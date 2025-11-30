package br.com.hotel.hospedagem.entity;

import java.time.LocalDate;

public class Hospedagem {
    private String id;
    private String cpfHospede;
    private Quarto quarto;
    private LocalDate inicio;
    private int dias;
    private boolean encerrada;
    private boolean diariasQuitadas;

    public Hospedagem(String id, String cpf, Quarto q, LocalDate inicio, int dias){
        this.id = id;
        this.cpfHospede = cpf;
        this.quarto = q;
        this.inicio = inicio;
        this.dias = dias;
        this.encerrada = false;
        this.diariasQuitadas = false;
    }

    public String getId(){ return id; }
    public Quarto getQuarto(){ return quarto; }
    public int getDias(){ return dias; }
    public String getCpfHospede(){ return cpfHospede; }
    public boolean isEncerrada(){ return encerrada; }
    public void encerrar(){ this.encerrada = true; quarto.setStatus(Quarto.Status.DISPONIVEL); }
    public void setDiariasQuitadas(boolean v){ this.diariasQuitadas = v; }
    public boolean isDiariasQuitadas(){ return diariasQuitadas; }
}