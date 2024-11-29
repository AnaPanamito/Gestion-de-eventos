/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.de.eventos;

/**
 *
 * @author InnoVausuario
 */
public class Persona {
     protected String nombre;
    protected String apellido;
    protected int cedula;
    protected int edad;
    protected int telefono;

    public Persona(String nombre, String apellido, int cedula, int edad, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

}
