package br.edu.insper.desagil.pi.cobasi;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Historico> historicos;

    public Clinica() {
        this.historicos = new ArrayList<>();
    }

    public void addHistorico(Tutor tutor, Animal animal) {
        historicos.add(new Historico(tutor, animal));
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }
}