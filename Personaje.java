public class Personaje {
    private String nombre;
    private String etapa;
    private String personalidad;

    public Personaje() {
    }

    public Personaje(String nombre, String etapa, String personalidad) {
        this.nombre = nombre;
        this.etapa = etapa;
        this.personalidad = personalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Etapa: " + etapa +
                " | Personalidad: " + personalidad;
    }

}
