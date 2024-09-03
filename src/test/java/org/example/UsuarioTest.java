package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveVerificarSenhaUsuario() {
        Usuario usuario = new Usuario();
        usuario.logarSenha(1234.0f, 1111, "rosto");
        assertEquals(true, usuario.isSituacaoUsuario());
    }

    @Test
    void deveVerificarPinUsuario() {
        Usuario usuario = new Usuario();
        usuario.logarPin(1234.0f, 1111, "rosto");
        assertEquals(true, usuario.isSituacaoUsuario());
    }

    @Test
    void deveVerificarPadraoUsuario() {
        Usuario usuario = new Usuario();
        usuario.logarReconhecimentoFacial(1234.0f, 1111, "rosto");
        assertEquals(true, usuario.isSituacaoUsuario());
    }

    @Test
    void deveNegarSenhaUsuario() {
        try {
            Usuario usuario = new Usuario();
            usuario.logarSenha(4444.0f, 1111, "rosto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Senha Incorreta!!", e.getMessage());
        }
    }

    @Test
    void deveNegarPinUsuario() {
        try {
            Usuario usuario = new Usuario();
            usuario.logarPin(4444.0f, 2222, "rosto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("PIN Incorreto!!", e.getMessage());
        }
    }

    @Test
    void deveNegarPadraoUsuario() {
        try {
            Usuario usuario = new Usuario();
            usuario.logarReconhecimentoFacial(4444.0f, 1111, "rostoErrado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Rosto não reconhecido!!", e.getMessage());
        }
    }

}