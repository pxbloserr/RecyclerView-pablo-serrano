package com.example.tarearecyclerview;

public class Contacto {

    private String nombre, apellidos, email, telefono;
    private int fotoContacto;

    public Contacto(int fotoContacto, String telefono, String email, String apellidos, String nombre) {
        this.fotoContacto = fotoContacto;
        this.telefono = telefono;
        this.email = email;
        this.apellidos = apellidos;
        this.nombre = nombre;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getFotoContacto() {
        return fotoContacto;
    }

    public void setFotoContacto(int fotoContacto) {
        this.fotoContacto = fotoContacto;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", fotoContacto=" + fotoContacto +
                '}';
    }

}
