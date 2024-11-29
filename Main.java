/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.de.eventos;

/**
 *
 * @author InnoVausuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // Crear sistema de gestión de eventos
        GestionEvento sistema = new GestionEvento();

        // Crear organizador
        Organizador organizador = new Organizador("Juan", "Pérez", 2589, 32, 987463210, "Gestión de Eventos");

        // Crear evento
        sistema.crearEvento("Tech Conference", "2024-12-15", "Auditorio Principal", organizador);

        // Obtener el evento creado
        Evento evento = sistema.verEventosRegistrados().get(0);

        // Crear y registrar participantes en el evento
        Participante participante1 = new Invitado("Ana", "Lopez", 67890, 28, 123456789, "Asistente", "VIP");
        Participante ponente = new Ponente("Carlos", "Martínez", 11111, 35, 56321479, "Ponente", "Hablando del Futuro", "10:00 AM");

        evento.registrarParticipante(participante1);
        evento.registrarParticipante(ponente);

        // Consultar información del evento y sus participantes
        System.out.println("Eventos registrados:");
        for (Evento e : sistema.verEventosRegistrados()) {
            e.mostrarInformacion();
        }

        // Opcional: Actualizar información de los participantes (si está implementado en el organizador)
        organizador.actualizarParticipantes();
    }
}

