import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        Scanner input = new Scanner(System.in, "UTF-8");
        Historia historia = new Historia();
        historia.agregarItemsRandoms();
        int opcion;
        do {
            try {
                System.out.println("--Creador de historias--");
                System.out.println("1) Crear historia libre.");
                System.out.println("2) Crear historia personalizada.");
                System.out.println("3) Mostrar historias personalizadas guardadas");
                System.out.println("0) Salir");
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        input.nextLine(); 
                        System.out.println("\n--- Creando historia libre ---");
                        System.out.println("¿Cómo se llama el protagonista?");
                        String nombre = input.nextLine();
                        System.out.println("¿En qué etapa de su vida está? (ej: su juventud, su vejez)");
                        String etapa = input.nextLine();
                        System.out.println("¿Cómo es su personalidad? (ej: aventurera, solitaria)");
                        String personalidad = input.nextLine();
                        System.out.println("¿En qué lugar ocurre la historia?");
                        String lugar = input.nextLine();
                        System.out.println("¿En qué momento del día ocurre?");
                        String momentoDelDia = input.nextLine();
                        System.out.println("Describe el ambiente (ej: caluroso y húmedo, silencioso)");
                        String ambiente = input.nextLine();
                        System.out.println("¿Qué evento extraño sucede?");
                        String evento = input.nextLine();
                        System.out.println("¿Qué problema surge a raíz de eso?");
                        String problema = input.nextLine();
                        System.out.println("¿Qué decide hacer el personaje?");
                        String decision = input.nextLine();
                        System.out.println("¿Cuál es el desenlace de la historia?");
                        String resultado = input.nextLine();
                        historia.crearPersonaje(nombre, etapa, personalidad);
                        historia.crearLugar(lugar, momentoDelDia, ambiente);
                        historia.crearSituacion(evento, problema, decision);
                        historia.crearFinal(resultado);

                        historia.crearhistoriaPersonal();
                        System.out.println("\n¡Historia guardada con éxito!");
                        break;
                    case 2:
                        System.out.println("Creando historia random. (Cuidado!, no quedan guardadas.)");
                        historia.crearHistoriaRandom();
                        break;
                    case 3:
                        System.out.println("Mostrando historias personalizadas guardadas.");
                        historia.mostrarHistorias();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.err.println("Ingrese una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Ha ocurrido un error :( " + e.getMessage());
                input.nextLine();
                opcion = -1;
            }
        } while (opcion != 0);
        input.close();
    }
}
