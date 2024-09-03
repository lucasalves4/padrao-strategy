package org.example;

public class AutenticacaoSenha implements Autenticacao{

    public boolean verificar(float senha, int pin, String padrao) {
        float senhaCorreta = 1234;
        if (senha != senhaCorreta) {
            throw new IllegalArgumentException("Senha Incorreta!!");
        } else {
            return true;
        }
    }
}
