package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PromptPagoTest {

    @Test
    void constroi(){
        PromptPago p = new PromptPago("pergunta",5.0);
        assertEquals("pergunta",p.getPergunta());
        assertNull(p.getResposta());
    }

    @Test
    void mudaResposta(){
        PromptPago q = new PromptPago("pergunta qualquer",5.0);
        q.setResposta("resposta");
        assertEquals("resposta",q.getResposta());
    }

    @Test
    void preco(){
        PromptPago a = new PromptPago("pergunta",0.1);
        assertEquals(0.8,a.calculaPreco(),0.01);

    }

}
