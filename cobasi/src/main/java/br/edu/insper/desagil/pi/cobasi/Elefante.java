package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Elefante extends Animal {
    private int pesoComida;

    public Elefante (String nome, LocalDate dataNascimento, double peso, int pesoComida) {
        super(nome, dataNascimento, peso);
        this.pesoComida = pesoComida;
    }

    @Override
    public String resumo() {
        return "Animal" + getNome() + "\n" + "Nascimento: " +getDataNascimento().toString() + "\n" + "Peso: " + getPeso() + "kg\n" + "Comida: " + pesoComida + "\n";
    }

}
