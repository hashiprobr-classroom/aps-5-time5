package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;


public class Historico {
    private Tutor tutor;
    private Animal animal;

    public Historico(Tutor tutor, Animal animal) {
        this.tutor = tutor;
        this.animal = animal;

    }

    public String resumo() {
        return tutor.resumoTutor() + "\n" + animal.resumo();
    }
}
