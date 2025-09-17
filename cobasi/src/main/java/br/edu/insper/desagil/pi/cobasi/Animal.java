package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Animal {
    private String nome;
    private int tipo;
    private LocalDate dataNascimento;
    private double peso;
    private String extra;


    public Animal(String nome, int tipo, LocalDate dataNascimento, double peso, String extra) {
        this.nome = nome;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.extra = extra;
    }
}
