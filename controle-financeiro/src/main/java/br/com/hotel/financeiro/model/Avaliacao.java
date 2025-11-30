package br.com.hotel.financeiro.model;

public class Avaliacao {
    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    @Override
    public String toString() {
        return "Nota: " + nota + ", Comentario: " + comentario;
    }
}