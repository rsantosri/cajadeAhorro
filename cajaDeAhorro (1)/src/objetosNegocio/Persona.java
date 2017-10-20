/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.Objects;

/**
 *
 * @author melis
 */
public class Persona {
    private String clavePersona;
    private String nombre;
    private String apellidos;
    private String telefono;
    private char tipo;
    private String aval;

    public Persona(String clavePersona) {
        this.clavePersona = clavePersona;
    }

    public Persona(String clavePersona, String nombre, String apellidos, String telefono, char tipo, String aval) {
        this.clavePersona = clavePersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.tipo = tipo;
        this.aval = aval;
    }

    public String getClavePersona() {
        return clavePersona;
    }

    public void setClavePersona(String clavePersona) {
        this.clavePersona = clavePersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getAval() {
        return aval;
    }

    public void setAval(String aval) {
        this.aval = aval;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.clavePersona);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.clavePersona, other.clavePersona)) {
            return false;
        }
        return true;
    }
    
}
