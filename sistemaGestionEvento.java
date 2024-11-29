
import java.util.ArrayList;
import java.util.List;

class SistemaGestionEvento {
    private List<Participante> participantes;
    private List<Organizador> organizadores;

    public SistemaGestionEvento() {
        this.participantes = new ArrayList<>();
        this.organizadores = new ArrayList<>();
    }

    public void crearEvento() {
        System.out.println("Creando un nuevo evento...");
    }

    public void eliminarEvento() {
        System.out.println("Eliminando un evento...");
    }

    public void registrarParticipante(Organizador organizador, String nombre, String fecha, String ubicacion) {
        Evento evento = new Evento(nombre, fecha, ubicacion, organizador);
        System.out.println("El Evento creado por " + organizador.getNombre() + " con el nombre " + nombre);
        System.out.println("*******Se a realizado con exito***********");
    }

    public void asignarOrganizador(Evento evento, Organizador organizador) {
        evento.setOrganizador(organizador);
        System.out.println("Organizador asignado: " + organizador.getNombre());
    }

    public List<Evento> verEventoRegistrado() {
        System.out.println("Mostrando eventos registrados...");
        return new ArrayList<>();
    }
}
