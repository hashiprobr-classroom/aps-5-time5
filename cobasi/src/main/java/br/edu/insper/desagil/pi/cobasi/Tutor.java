package br.edu.insper.desagil.pi.cobasi;

public class Tutor {
    private String nomeTutor;
    private String enderecoTutor;
    private String telefoneTutor;

    public Tutor(String nomeTutor, String enderecoTutor, String telefoneTutor) {
        this.nomeTutor = nomeTutor;
        this.enderecoTutor = enderecoTutor;
        this.telefoneTutor = telefoneTutor;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public String getEnderecoTutor() {
        return enderecoTutor;
    }

    public String getTelefoneTutor() {
        return telefoneTutor;
    }

    public void setEnderecoTutor(String enderecoTutor) {
        this.enderecoTutor = enderecoTutor;
    }

    public void setTelefoneTutor(String telefoneTutor) {
        this.telefoneTutor = telefoneTutor;
    }

    public String resumoTutor() {
        String summary = "Tutor: " + nomeTutor + "\n";
        if (enderecoTutor != null) {
            summary += "Endereço: " + enderecoTutor + "\n";
        }
        if (telefoneTutor != null) {
            summary += "Telefone: " + telefoneTutor + "\n";
        }
        return summary;
    }

}
