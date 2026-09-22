package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txt_pseudonimo;
    private String rad_genero;
    private String sel_suscripcion;
    private String fechaNacimiento;
    private String chk_terminos;
    private String comentraios;

    public Usuario() {
    }

    public Usuario(String comentraios, String chk_terminos, String fechaNacimiento, String sel_suscripcion, String rad_genero, String txt_pseudonimo, String contrasenia, String correo, String nombre) {
        this.comentraios = comentraios;
        this.chk_terminos = chk_terminos;
        this.fechaNacimiento = fechaNacimiento;
        this.sel_suscripcion = sel_suscripcion;
        this.rad_genero = rad_genero;
        this.txt_pseudonimo = txt_pseudonimo;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSel_suscripcion() {
        return sel_suscripcion;
    }

    public void setSel_suscripcion(String sel_suscripcion) {
        this.sel_suscripcion = sel_suscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getComentraios() {
        return comentraios;
    }

    public void setComentraios(String comentraios) {
        this.comentraios = comentraios;
    }
}