package br.com.hotel.hospedagem.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.com.hotel.hospedagem.entity.Hospedagem;
import br.com.hotel.hospedagem.entity.Quarto;

public class ControleHospedagem {
    private final RepositorioQuartos repoQuartos;
    private final Map<String, Hospedagem> hospedagens = new HashMap<>();

    public ControleHospedagem(RepositorioQuartos repo){ this.repoQuartos = repo; }

    public List<Quarto> exibirQuartosDisponiveis(){ return repoQuartos.listarDisponiveis(); }

    public Hospedagem iniciarHospedagem(String id, String cpf, Quarto q, LocalDate inicio, int dias){
        q.setStatus(Quarto.Status.OCUPADO);
        Hospedagem h = new Hospedagem(id, cpf, q, inicio, dias);
        hospedagens.put(id, h);
        return h;
    }

    public Optional<Hospedagem> buscarHospedagem(String id) { return Optional.ofNullable(hospedagens.get(id)); }

    public boolean encerrarHospedagem(String id){
        Hospedagem h = hospedagens.get(id);
        if(h==null) return false;
        h.encerrar();
        return true;
    }

    public Optional<Quarto> buscarQuartoPorNumero(String numero) {
        return repoQuartos.buscar(numero);
    }
}