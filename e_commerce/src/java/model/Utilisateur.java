/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tenshi16
 */
public class Utilisateur {
    
    private String correo;
    private String nombre;
    private String Motdepasse;

    public String getCorreo() {
        return correo;
    }

    public Utilisateur(String correo, String nombre, String Motdepasse) {
        this.correo = correo;
        this.nombre = nombre;
        this.Motdepasse = Motdepasse;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return Motdepasse;
    }

    public void setContraseña(String Motdepasse) {
        this.Motdepasse = Motdepasse;
    }
    
}
