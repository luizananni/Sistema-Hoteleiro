package br.com.hotel.hospedagem;

import br.com.hotel.hospedagem.boundary.BoundaryConsole;
import br.com.hotel.hospedagem.controller.ControleHospedagem;
import br.com.hotel.hospedagem.controller.RepositorioQuartos;
import br.com.hotel.hospedagem.entity.QuartoLuxo;
import br.com.hotel.hospedagem.entity.QuartoStandard;
import br.com.hotel.hospedagem.entity.QuartoSuperior;

public class Main {
    public static void main(String[] args) {
        RepositorioQuartos repoQuartos = new RepositorioQuartos();
        repoQuartos.adicionar(new QuartoStandard("101", 100));
        repoQuartos.adicionar(new QuartoSuperior("102", 150));
        repoQuartos.adicionar(new QuartoLuxo("201", 300));

        ControleHospedagem controleHosp = new ControleHospedagem(repoQuartos);
        BoundaryConsole menu = new BoundaryConsole(controleHosp);
        menu.iniciarMenu();
    }
}