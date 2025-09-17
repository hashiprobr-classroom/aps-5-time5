package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public abstract class Animal {
    private String nome;
    private LocalDate dataNascimento;
    private double peso;



    public Animal(String nome, LocalDate dataNascimento, double peso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
    }

    public String getNome () {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public abstract String resumo();
}
