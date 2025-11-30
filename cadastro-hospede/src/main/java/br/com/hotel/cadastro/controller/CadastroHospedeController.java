package br.com.hotel.cadastro.controller;

import java.util.List;

import br.com.hotel.cadastro.entity.Hospede;
import br.com.hotel.cadastro.interfaces.ICadastroHospede;
import br.com.hotel.cadastro.repository.HospedeRepository;
import br.com.hotel.cadastro.utils.Validador;

public class CadastroHospedeController implements ICadastroHospede {

    private HospedeRepository repo = new HospedeRepository();

    @Override
    public Hospede cadastrar(Hospede hospede) {
        if (!Validador.validarCPF(hospede.getCpf())) {
            throw new IllegalArgumentException("CPF invalido!");
        }
        if (!Validador.validarEmail(hospede.getEmail())) {
            throw new IllegalArgumentException("Email invalido!");
        }
        return repo.salvar(hospede);
    }

    @Override
    public Hospede buscarPorCpf(String cpf) {
        return repo.buscar(cpf);
    }

    @Override
    public List<Hospede> listarTodos() {
        return repo.listar();
    }
}