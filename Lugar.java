import java.util.ArrayList;

public class Lugar {
    private String nombreLugar;
    private String momentoDelDia;
    private String ambiente;

    public Lugar() {
    }

    public Lugar(String nombreLugar, String momentoDelDia, String ambiente) {
        this.nombreLugar = nombreLugar;
        this.momentoDelDia = momentoDelDia;
        this.ambiente = ambiente;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getMomentoDelDia() {
        return momentoDelDia;
    }

    public void setMomentoDelDia(String momentoDelDia) {
        this.momentoDelDia = momentoDelDia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return "Lugar [nombreLugar=" + nombreLugar + ", momentoDelDia=" + momentoDelDia + ", ambiente=" + ambiente
                + "]";
    }

}
