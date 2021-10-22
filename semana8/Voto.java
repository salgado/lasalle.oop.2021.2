public class Voto implements Comparable<Voto> {
    private String candidato;
    private Integer qtdVotos;

    public Voto(String nome, Integer voto) {
        this.candidato = nome;
        this.qtdVotos = voto;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public Integer getQtdVotos() {
        return qtdVotos;
    }

    public void setQtdVotos(Integer qtdVotos) {
        this.qtdVotos = qtdVotos;
    }

    @Override
    public String toString() {
        return "Voto [candidato=" + candidato + ", qtdVotos=" + qtdVotos + "]";
    }

    @Override
    public int compareTo(Voto outroVoto) {
        if (this.qtdVotos < outroVoto.getQtdVotos())
            return 1;
        else if (this.qtdVotos > outroVoto.getQtdVotos())
            return -1;
        else
            return 0;
    }

}
