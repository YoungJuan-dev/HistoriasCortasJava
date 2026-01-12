public class Situacion {
    private String evento;
    private String problema;
    private String decision;

    public Situacion() {
    }

    public Situacion(String evento, String problema, String decision) {
        this.evento = evento;
        this.problema = problema;
        this.decision = decision;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    @Override
    public String toString() {
        return "Situacion [evento=" + evento + ", problema=" + problema + ", decision=" + decision + "]";
    }
   
}
