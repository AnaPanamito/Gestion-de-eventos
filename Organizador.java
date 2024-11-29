/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

import java.util.ArrayList;

/**
 *
 * @author InnoVausuario
 */
public class Organizador extends Persona implements Notificacion {
    private String nombreEvento;

    public Organizador(String nombre, String apellido, int cedula, int edad, int telefono, String nombreEvento) {
        super(nombre, apellido, cedula, edad, telefono);
        this.nombreEvento = nombreEvento;
    }

    public void crearEvento() {
        System.out.println("Evento creado: " + nombreEvento);
    }

    public void mostrarEvento() {
        System.out.println("Mostrando evento: " + nombreEvento);
    }

    @Override
    public void actualizarParticipantes() {
        System.out.println("Actualizando participantes en el evento: " + nombreEvento);
    }
}
