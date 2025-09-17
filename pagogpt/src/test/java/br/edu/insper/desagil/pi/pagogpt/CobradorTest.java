package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CobradorTest {

    @Test
    public void nenhumaValida() {
        List<Conversa> lista = new ArrayList<>();
        Cobrador cobrador = new Cobrador(lista);

        Usuario alvo = new Usuario("alvo", "alvoemail");

        assertEquals(0.0, cobrador.calculaTotal(alvo), 0.0001);
    }

    @Test
    public void umaValida() {
        Usuario u1 = new Usuario("nome1", "email1");
        Usuario u2 = new Usuario("nome2", "email2");
        Usuario u3 = new Usuario("nome3", "email3");

        Conversa c1 = new Conversa(u1);
        c1.adiciona(new PromptPago("pergunta", 1.0));

        Conversa c2 = new Conversa(u2);
        c2.adiciona(new PromptPago("pergunta", 1.5));

        Conversa c3 = new Conversa(u3);
        c3.adiciona(new PromptPago("pergunta", 0.5));

        List<Conversa> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        Cobrador cobrador = new Cobrador(lista);

        Usuario alvo = new Usuario("alvo", "email2");
        assertEquals(12.0, cobrador.calculaTotal(alvo), 0.0001);
    }

    @Test
    public void duasValidas() {
        Usuario u1 = new Usuario("nome1", "emailX");
        Usuario u2 = new Usuario("nome2", "emailY");
        Usuario u3 = new Usuario("nome3", "emailX");

        Conversa c1 = new Conversa(u1);
        c1.adiciona(new PromptPago("pergunta", 1.0));

        Conversa c2 = new Conversa(u2);
        c2.adiciona(new PromptPago("pergunta", 1.5));

        Conversa c3 = new Conversa(u3);
        c3.adiciona(new PromptPago("pergunta", 0.5));

        List<Conversa> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        Cobrador cobrador = new Cobrador(lista);

        Usuario alvo = new Usuario("alvo", "emailX");
        assertEquals(12.0, cobrador.calculaTotal(alvo), 0.0001);
    }

    @Test
    public void tresValidas() {
        Usuario u1 = new Usuario("nome1", "emailZ");
        Usuario u2 = new Usuario("nome2", "emailZ");
        Usuario u3 = new Usuario("nome3", "emailZ");

        Conversa c1 = new Conversa(u1);
        c1.adiciona(new PromptPago("pergunta", 1.0));

        Conversa c2 = new Conversa(u2);
        c2.adiciona(new PromptPago("pergunta", 1.5));

        Conversa c3 = new Conversa(u3);
        c3.adiciona(new PromptPago("pergunta", 0.5));

        List<Conversa> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        Cobrador cobrador = new Cobrador(lista);

        Usuario alvo = new Usuario("alvo", "emailZ");
        assertEquals(24.0, cobrador.calculaTotal(alvo), 0.0001);
    }
}
