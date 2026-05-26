package entidades;
public class Paciente {

    private String nome;
    private int nivelUrgencia;
    private int tempoEsperaMinutos;
    private boolean grupoVulneravel;

    public Paciente(String nome, int nivelUrgencia, int tempoEsperaMinutos, boolean grupoVulneravel) {
        this.nome = nome;
        this.nivelUrgencia = nivelUrgencia;
        this.tempoEsperaMinutos = tempoEsperaMinutos;
        this.grupoVulneravel = grupoVulneravel;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public int getTempoEsperaMinutos() {
        return tempoEsperaMinutos;
    }

    public boolean isGrupoVulneravel() {
        return grupoVulneravel;
    }

    /**
     * Retorna true se ESTE paciente possui prioridade maior que o outro.
     */
    public boolean temMaiorPrioridade(Paciente outro) {

        // 1. Maior nível de urgência
        if (this.nivelUrgencia != outro.nivelUrgencia) {
            return this.nivelUrgencia > outro.nivelUrgencia;
        }

        // 2. Maior tempo de espera
        if (this.tempoEsperaMinutos != outro.tempoEsperaMinutos) {
            return this.tempoEsperaMinutos > outro.tempoEsperaMinutos;
        }

        // 3. Grupo vulnerável
        return this.grupoVulneravel && !outro.grupoVulneravel;
    }

    @Override
    public String toString() {
        return nome +
                " [Urgência=" + nivelUrgencia +
                ", Espera=" + tempoEsperaMinutos +
                "min, Vulnerável=" + grupoVulneravel + "]";
    }
}