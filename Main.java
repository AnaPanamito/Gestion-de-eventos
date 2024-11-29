public class Main {
    public static void main(String[] args) {
        // Crear organizador
        Organizador organizador = new Organizador("Carlos", "Perez", "123456789", 35, "0987654321");

        // Crear sistema de gestión de eventos
        SistemaGestionEvento sistema = new SistemaGestionEvento();

        // Crear evento
        sistema.registrarParticipante(organizador, "Conferencia de Tecnología", "2024-12-15", "Centro de Convenciones");

        // Crear participantes
        Participante invitado = new Invitado("Mario", "Rivas", "985432121", 28, "0956789678", "Invitado", "VIP");
        Participante ponente = new Ponente("Luis", "Panamito", "1112345455", 40, "0998765432", "Ponente", "Inteligencia Artificial", "10:00 AM");

        // Registrar participantes en el evento
        Evento evento = new Evento("Conferencia de Tecnologia", "2024-12-15", "Centro de Convenciones", organizador);
        evento.registrarParticipante(invitado);
        evento.registrarParticipante(ponente);

        // Mostrar información del evento
        evento.mostrarInformacion();

        // Acciones de los participantes
        invitado.aceptarInvitacion();
        System.out.println("El ponente realizo cambios a la presentacion ");
        ((Ponente) ponente).modificarPresentacion();
    }
}
