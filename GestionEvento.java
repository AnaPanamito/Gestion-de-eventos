/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author InnoVausuario
 */
public class GestionEvento {
    private List<Participante> participantes;
    private List<Organizador> organizadores;
    private List<Evento> eventos;

    public GestionEvento() {
        participantes = new ArrayList<>();
        organizadores = new ArrayList<>();
        eventos = new ArrayList<>();
    }

    public void crearEvento(String nombre, String fecha, String ubicacion, Organizador organizador) {
        Evento evento = new Evento(nombre, fecha, ubicacion, organizador);
        eventos.add(evento);
        System.out.println("Evento creado: " + nombre);
    }

    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
        System.out.println("Evento eliminado: " + evento);
    }

    public void registrarParticipante(Organizador organizador, String nombre, String fecha, String ubicacion) {
        Evento evento = new Evento(nombre, fecha, ubicacion, organizador);
        organizador.crearEvento();
        eventos.add(evento);
    }

    public List<Evento> verEventosRegistrados() {
        return eventos;
    }
}