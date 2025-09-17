package br.edu.insper.desagil.pi.pagogpt;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversaTest {

    @Test
    void subTotalVazio() {
        Usuario u = new Usuario("nome", "email");
        Conversa c = new Conversa(u);
        assertEquals(0.0, c.calculaSubTotal(), 0.0001);
    }

    @Test
    void subTotal() {
        Usuario u = new Usuario("nome", "email");
        Conversa c = new Conversa(u);

        Prompt p = new PromptPago("pergunta12", 1.0);
        Prompt q = new PromptPago("pergunta12", 1.5);
        Prompt r = new PromptPago("pergunta12", 1.55);

        c.adiciona(p);
        c.adiciona(q);
        c.adiciona(r);

        assertEquals(40.5, c.calculaSubTotal(), 0.01);
    }

    @Test
    void porPostVazio() {
        Usuario u = new Usuario("nome", "email");
        Conversa c = new Conversa(u);

        IllegalStateException ex = assertThrows(IllegalStateException.class, c::calculaSubMedia);
        assertEquals("Nenhum prompt!", ex.getMessage());
    }

    @Test
    void porPost() {
        Usuario u = new Usuario("nome", "email");
        Conversa c = new Conversa(u);

        Prompt p = new PromptPago("pergunta12", 1.0);
        Prompt q = new PromptPago("pergunta12", 1.5);
        Prompt r = new PromptPago("pergunta12", 1.55);

        c.adiciona(p);
        c.adiciona(q);
        c.adiciona(r);

        assertEquals(13.5, c.calculaSubMedia(), 0.01);
    }
}
