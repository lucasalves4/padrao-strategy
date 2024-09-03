package org.example;

public class AutenticacaoPin implements Autenticacao{

    public boolean verificar(float senha, int pin, String padrao) {
        int pinCorreto = 1111;
        if (pin != pinCorreto) {
            throw new IllegalArgumentException("PIN Incorreto!!");
        } else {
            return true;
        }
    }
}
