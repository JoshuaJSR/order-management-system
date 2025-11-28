package com.joshua.ordermanagement.model;

public class Cliente {
    private Long idCliente;
    private String correo;
    private String contrasena;
    private String telefono;

    public Cliente() {}

    public Cliente(Long idCliente, String correo, String contrasena, String telefono) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", correo='" + correo + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
