package org.example;

public class Autenticador {

    private float senha;
    private int pin;
    private String padrao;

    public Autenticador (float senha, int pin, String padrao) {
        this.senha = senha;
        this.pin = pin;
        this.padrao = padrao;
    }

    public boolean verificar(Autenticacao autenticacao) {
        return autenticacao.verificar(senha, pin, padrao);
    }
}
