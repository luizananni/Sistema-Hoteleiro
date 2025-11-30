package br.com.hotel.cadastro.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.cadastro.entity.Hospede;

public class HospedeRepository {

    private List<Hospede> hospedes = new ArrayList<>();

    public Hospede salvar(Hospede hospede) {
        hospedes.add(hospede);
        return hospede;
    }

    public Hospede buscar(String cpf) {
        return hospedes.stream()
                .filter(h -> h.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public List<Hospede> listar() {
        return hospedes;
    }
}