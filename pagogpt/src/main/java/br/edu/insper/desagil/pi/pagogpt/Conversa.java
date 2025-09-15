package br.edu.insper.desagil.pi.pagogpt;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
    private Usuario usuario;
    private List<Prompt> prompts;

    public Conversa(Usuario usuario) {
        this.prompts = new ArrayList<>();
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void adiciona(Prompt prompt){
        prompts.add(prompt);
    }

    public double calculaSubTotal(){
        double soma=0.0;
        for (Prompt prompt : prompts){
            soma+= prompt.calculaPreco();
        }
        return soma;
    }
    public double calculaSubMedia(){
        int tamanho = prompts.size();
        double soma = calculaSubTotal();

        if (prompts.isEmpty()) {
            throw new IllegalStateException("Nenhum prompt!");
        }
        return soma/tamanho;
    }
}
