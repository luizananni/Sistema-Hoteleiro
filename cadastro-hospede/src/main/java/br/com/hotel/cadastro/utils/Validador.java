package br.com.hotel.cadastro.utils;

public class Validador {

    public static boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }
}