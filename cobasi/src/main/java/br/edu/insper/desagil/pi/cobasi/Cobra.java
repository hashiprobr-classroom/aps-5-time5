package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;

public class Cobra extends Animal {
        private boolean venenosa;

        public Cobra (String nome, LocalDate dataNascimento, double peso, boolean venenosa) {
            super(nome, dataNascimento, peso);
            this.venenosa = venenosa;
        }

        @Override
        public String resumo() {
            return "Animal" + getNome() + "\n" + "Nascimento: " +getDataNascimento().toString() + "\n" + "Peso: " + getPeso() + "kg\n" + "Venenosa: " + venenosa + "\n";
        }

}

