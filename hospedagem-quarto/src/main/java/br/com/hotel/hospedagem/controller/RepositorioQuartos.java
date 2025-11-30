package br.com.hotel.hospedagem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.com.hotel.hospedagem.entity.Quarto;

public class RepositorioQuartos {
    private final Map<String, Quarto> quartos = new HashMap<>();

    public void adicionar(Quarto q){ quartos.put(q.getNumero(), q); }

    public Optional<Quarto> buscar(String numero){ return Optional.ofNullable(quartos.get(numero)); }

    public List<Quarto> listarTodos(){ return new ArrayList<>(quartos.values()); }

    public List<Quarto> listarDisponiveis(){
        List<Quarto> r = new ArrayList<>();
        for(Quarto q : quartos.values()) if(q.getStatus()==Quarto.Status.DISPONIVEL) r.add(q);
        return r;
    }
}