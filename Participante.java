/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

/**
 *
 * @author InnoVausuario
 */
public class Participante extends Persona {
    private String rol;

    public Participante(String nombre, String apellido, int cedula, int edad, int telefono, String rol) {
        super(nombre, apellido, cedula, edad, telefono);
        this.rol = rol;
    }

    public void aceptarInvitacion() {
        System.out.println("Invitación aceptada por " + nombre);
    }

    public void cancelarInvitacion() {
        System.out.println("Invitación cancelada por " + nombre);
    }
}
