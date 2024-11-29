/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

/**
 *
 * @author InnoVausuario
 */
public class Invitado extends Participante {
    private String tipoInvitado;

    public Invitado(String nombre, String apellido, int cedula, int edad, int telefono, String rol, String tipoInvitado) {
        super(nombre, apellido, cedula, edad, telefono, rol);
        this.tipoInvitado = tipoInvitado;
    }

    public void mostrarInvitacion() {
        System.out.println("Invitación tipo: " + tipoInvitado);
    }
}
