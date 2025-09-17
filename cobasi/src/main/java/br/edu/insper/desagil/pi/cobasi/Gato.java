package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Gato extends Animal {
    private String doenca;

    public Gato (String nome, LocalDate dataNascimento, double peso, String doenca) {
        super(nome, dataNascimento, peso);
        this.doenca = doenca;
    }

    @Override
    public String resumo() {
        return "Animal" + getNome() + "\n" + "Nascimento: " +getDataNascimento().toString() + "\n" + "Peso: " + getPeso() + "kg\n" + "Doença: " + doenca + "\n";
    }
}
