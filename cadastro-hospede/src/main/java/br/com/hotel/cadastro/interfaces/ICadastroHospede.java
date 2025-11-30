package br.com.hotel.cadastro.interfaces;

import java.util.List;

import br.com.hotel.cadastro.entity.Hospede;

public interface ICadastroHospede {
    Hospede cadastrar(Hospede hospede);
    Hospede buscarPorCpf(String cpf);
    List<Hospede> listarTodos();
}