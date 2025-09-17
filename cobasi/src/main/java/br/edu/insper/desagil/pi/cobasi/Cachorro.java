package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Cachorro extends Animal {
    private String banho;

    public Cachorro(String nome, LocalDate dataNascimento, double peso, String banho) {
        super(nome, dataNascimento, peso);
        this.banho = banho;
    }

    @Override
    public String resumo() {
        return "Animal" + getNome() + "\n" + "Nascimento: " +getDataNascimento().toString() + "\n" + "Peso: " + getPeso() + "kg\n" + "Banho: " + banho + "\n";
    }

}
