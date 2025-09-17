package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PromptGratuitoTest {

    public static final double DELTA = 0.0001;

    @Test
    void precoCurto(){
       PromptGratuito p = new PromptGratuito("pergunta",10);
       assertEquals(0.0, p.calculaPreco(), DELTA);
   }

   @Test
    void precoLongo(){
       PromptGratuito l = new PromptGratuito("pergunta longa",10);
       assertEquals(14.0, l.calculaPreco(), DELTA);
   }
}
