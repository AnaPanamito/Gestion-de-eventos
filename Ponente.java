/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

/**
 *
 * @author InnoVausuario
 */
public class Ponente extends Participante {
    private String temaPresentacion;
    private String horaPresentacion;

    public Ponente(String nombre, String apellido, int cedula, int edad, int telefono, String rol, String temaPresentacion, String horaPresentacion) {
        super(nombre, apellido, cedula, edad, telefono, rol);
        this.temaPresentacion = temaPresentacion;
        this.horaPresentacion = horaPresentacion;
    }

    public void modificarPresentacion() {
        System.out.println("Modificando presentación de " + nombre + ": " + temaPresentacion);
    }
}
