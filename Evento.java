/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

import java.util.List;


/**
 *
 * @author InnoVausuario
 */
public class Evento {
   private String nombre;
    private String fecha;
    private String ubicacion;
    private Organizador organizador;
    private List<Participante> participantes;

    public Evento(String nombre, String fecha, String ubicacion, Organizador organizador) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.organizador = organizador;
    }

    public void registrarParticipante(Participante p) {
       boolean add = participantes.add(p);
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre + ", Fecha: " + fecha + ", Ubicación: " + ubicacion);
    }
}
