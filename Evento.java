public class Evento {
    private String nombre;
    private String fecha;
    private String ubicacion;
    private Organizador organizador;

    public Evento(String nombre, String fecha, String ubicacion, Organizador organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
    }

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Organizador getOrganizador() {
        return organizador;
    }

    public void setOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }

    public void registrarParticipante(Participante participante) {
        System.out.println(participante.getNombre() + " ha sido registrado en el evento " + nombre);
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre + ", Fecha: " + fecha + ", Ubicación: " + ubicacion);
    }
}
