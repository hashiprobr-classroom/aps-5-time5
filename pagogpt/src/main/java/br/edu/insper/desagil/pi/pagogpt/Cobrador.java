package br.edu.insper.desagil.pi.pagogpt;

import java.util.List;

public class Cobrador {
    private List<Conversa> conversas;

    public Cobrador(List<Conversa> conversas) {
        this.conversas = conversas;
    }
    public double calculaTotal(Usuario usuario) {
        double soma = 0.0;
        String emailAlvo = usuario.getEmail();

        for (Conversa conversa : conversas) {
            if (conversa.getUsuario().getEmail().equals(emailAlvo)) {
                soma += conversa.calculaSubTotal();
            }
        }
        return soma;
    }
}

