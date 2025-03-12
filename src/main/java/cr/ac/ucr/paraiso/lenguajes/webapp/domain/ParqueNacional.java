/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucr.paraiso.lenguajes.webapp.domain;

/**
 *
 * @author Alvaro Mena
 */
public class ParqueNacional {
    private int idParque;
    private String nombre;

    public ParqueNacional() {
    }

    public ParqueNacional(int idParque, String nombre) {
        this.idParque = idParque;
        this.nombre = nombre;
    }

    public int getIdParque() {
        return idParque;
    }

    public void setIdParque(int idParque) {
        this.idParque = idParque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
