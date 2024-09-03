package org.example;

import java.util.Objects;

public class AutenticacaoReconhecimentoFacial implements Autenticacao{

    public boolean verificar(float senha, int pin, String padrao) {
        String padraoCorreto = "rosto";
        if (padrao != padraoCorreto) {
            throw new IllegalArgumentException("Rosto não reconhecido!!");
        } else {
            return true;
        }
    }
}
