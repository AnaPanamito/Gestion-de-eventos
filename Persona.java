public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String telefono;

    public Persona(String nombre, String apellido, String cedula, int edad, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Organizador extends Persona {
    public Organizador(String nombre, String apellido, String cedula, int edad, String telefono) {
        super(nombre, apellido, cedula, edad, telefono);
    }

    public void crearEvento() {
        System.out.println("Evento creado por " + getNombre());
    }

    public void mostrarEvento() {
        System.out.println("Mostrando los eventos organizados por " + getNombre());
    }

    public void listarInvitados() {
        System.out.println("Listando invitados...");
    }

    public void modificarEvento() {
        System.out.println("Evento modificado.");
    }

    public void eliminarEvento() {
        System.out.println("Evento eliminado.");
    }
}

class Participante extends Persona {
    private String rol;

    public Participante(String nombre, String apellido, String cedula, int edad, String telefono, String rol) {
        super(nombre, apellido, cedula, edad, telefono);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void inscribirse() {
        System.out.println(getNombre() + " se ha inscrito.");
    }

    public void aceptarInvitacion() {
        System.out.println(getNombre() + " ha aceptado la invitación.");
    }

    public void cancelarInvitacion() {
        System.out.println(getNombre() + " ha cancelado la invitación.");
    }
}

class Invitado extends Participante {
    private String tipoInvitado;

    public Invitado(String nombre, String apellido, String cedula, int edad, String telefono, String rol, String tipoInvitado) {
        super(nombre, apellido, cedula, edad, telefono, rol);
        this.tipoInvitado = tipoInvitado;
    }

    public String getTipoInvitado() {
        return tipoInvitado;
    }

    public void setTipoInvitado(String tipoInvitado) {
        this.tipoInvitado = tipoInvitado;
    }

    public void mostrarInvitacion() {
        System.out.println("Mostrando invitación para " + getNombre());
    }

    public boolean confirmarAsistencia() {
        System.out.println(getNombre() + " ha confirmado asistencia.");
        return true;
    }
}

class Ponente extends Participante {
    private String temaPresentacion;
    private String horaPresentacion;

    public Ponente(String nombre, String apellido, String cedula, int edad, String telefono, String rol, String temaPresentacion, String horaPresentacion) {
        super(nombre, apellido, cedula, edad, telefono, rol);
        this.temaPresentacion = temaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    public String getTemaPresentacion() {
        return temaPresentacion;
    }

    public void setTemaPresentacion(String temaPresentacion) {
        this.temaPresentacion = temaPresentacion;
    }

    public String getHoraPresentacion() {
        return horaPresentacion;
    }

    public void setHoraPresentacion(String horaPresentacion) {
        this.horaPresentacion = horaPresentacion;
    }

    public void modificarPresentacion() {
        System.out.println("Presentación modificada.");
    }
}
