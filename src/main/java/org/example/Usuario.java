package org.example;

public class Usuario {

    private boolean situacaoUsuario;

    public boolean isSituacaoUsuario() {
        return situacaoUsuario;
    }

    public void logarSenha (float senhaUsuario, int pinUsuario, String padraoUsuario) {
        Autenticador autenticador = new Autenticador(senhaUsuario, pinUsuario, padraoUsuario);
        this.situacaoUsuario = autenticador.verificar(new AutenticacaoSenha());
    }

    public void logarPin (float senhaUsuario, int pinUsuario, String padraoUsuario) {
        Autenticador autenticador = new Autenticador(senhaUsuario, pinUsuario, padraoUsuario);
        this.situacaoUsuario = autenticador.verificar(new AutenticacaoPin());
    }

    public void logarReconhecimentoFacial (float senhaUsuario, int pinUsuario, String padraoUsuario) {
        Autenticador autenticador = new Autenticador(senhaUsuario, pinUsuario, padraoUsuario);
        this.situacaoUsuario = autenticador.verificar(new AutenticacaoReconhecimentoFacial());
    }
}
