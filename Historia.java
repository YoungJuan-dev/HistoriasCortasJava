import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Historia {

    Random IA = new Random();
    ArrayList<String> historia = new ArrayList<>();
    ArrayList<Lugar> lugares = new ArrayList<>();
    ArrayList<Personaje> personajes = new ArrayList<>();
    ArrayList<Situacion> situaciones = new ArrayList<>();
    ArrayList<Final> finales = new ArrayList<>();
    Personaje creacionPersonaje = new Personaje();
    Lugar creacionLugar = new Lugar();
    Situacion creacionSituacion = new Situacion();
    Final creacioFinal = new Final();

    public void crearPersonaje(String nombre, String etapa, String personalidad) {
        if (nombre.isEmpty() || etapa.isEmpty() || personalidad.isEmpty()) {
            System.err.println("Debe ingresar texto en cada campo.");
            return;
        }
        creacionPersonaje = new Personaje(nombre, etapa, personalidad);
    }

    public void crearLugar(String nombreLugar, String momentoDelDia, String ambiente) {
        if (nombreLugar.isEmpty() || momentoDelDia.isEmpty() || ambiente.isEmpty()) {
            System.err.println("Debe ingresar texto en cada campo.");
            return;
        }
        creacionLugar = new Lugar(nombreLugar, momentoDelDia, ambiente);
    }

    public void crearSituacion(String evento, String problema, String decision) {
        if (evento.isEmpty() || problema.isEmpty() || decision.isEmpty()) {
            System.err.println("Debe ingresar texto en cada campo.");
            return;
        }
        creacionSituacion = new Situacion(evento, problema, decision);
    }

    public void crearFinal(String resultado) {
        if (resultado.isEmpty()) {
            System.err.println("Debe ingresar texto en cada campo.");
            return;
        }
        creacioFinal = new Final(resultado);
    }

    public void agregarItemsRandoms() {
        personajes.add(new Personaje("Alex", "su juventud", "de naturaleza curiosa"));
        personajes.add(new Personaje("Luna", "su adultez", "de carácter reservado"));
        personajes.add(new Personaje("Marcos", "de vejez", "de gran sabiduría"));

        lugares.add(new Lugar("un bosque", "la noche", "donde todo era oscuro y silencioso"));
        lugares.add(new Lugar("una ciudad", "el atardecer", "lleno de caos y ruido"));
        lugares.add(new Lugar("una habitación", "la madrugada", "que se sentía fría y solitaria"));

        situaciones.add(new Situacion(
                "algo extraño ocurrió de repente",
                "sentía que no estaba a salvo",
                "actuar con cautela"));

        situaciones.add(new Situacion(
                "un ruido rompió el silencio",
                "no estaba claro de dónde provenía",
                "investigar con cuidado"));
        situaciones.add(new Situacion(
                "una sombra cruzó velozmente frente a sus ojos",
                "no lograba distinguir si era humana o animal",
                "mantener la respiración para no ser descubierto"));

        finales.add(new Final("logró salir del lugar con más preguntas que respuestas"));
        finales.add(new Final("descubrió que el miedo estaba solo en su mente"));
        finales.add(new Final("cambió para siempre después de esa noche"));
    }

    public void crearhistoriaPersonal() {
        String texto = creacionPersonaje.getNombre() + ", en su etapa " + creacionPersonaje.getEtapa()
                + ", tenía una personalidad " + creacionPersonaje.getPersonalidad() + ".\n" +
                "Se encontraba en " + creacionLugar.getNombreLugar() + " durante "
                + creacionLugar.getMomentoDelDia() +
                ", un lugar " + creacionLugar.getAmbiente() + ", cuando " + creacionSituacion.getEvento() + ".\n" +
                "El problema era que " + creacionSituacion.getProblema() + ", así que decidió "
                + creacionSituacion.getDecision() + ".\n" +
                "Finalmente, " + creacioFinal.getResultado() + ".";
        historia.add(texto);
    }

    public void mostrarHistorias() {
        if (historia.isEmpty()) {
            System.out.println("No hay historias agregadas, no hay nada que mostrar.");
            return;
        }
        for (int i = 0; i < historia.size(); i++) {
            System.out.println(" Historia " + (i + 1) + ")" + historia.get(i));
        }
    }

    public void crearHistoriaRandom() {
        Personaje personaje = personajes.get(IA.nextInt(personajes.size()));
        Lugar lugar = lugares.get(IA.nextInt(lugares.size()));
        Situacion situacion = situaciones.get(IA.nextInt(situaciones.size()));
        Final fin = finales.get(IA.nextInt(finales.size()));
        System.out.println(personaje.getNombre() + ", en su etapa " + personaje.getEtapa()
                + ", tenía una personalidad " + personaje.getPersonalidad() + ".\n" +
                "Se encontraba en " + lugar.getNombreLugar() + " durante "
                + lugar.getMomentoDelDia() +
                ", un lugar " + lugar.getAmbiente() + ", cuando " + situacion.getEvento() + ".\n" +
                "El problema era que " + situacion.getProblema() + ", así que decidió "
                + situacion.getDecision() + ".\n" +
                "Finalmente, " + fin.getResultado() + ".");
    }
}
