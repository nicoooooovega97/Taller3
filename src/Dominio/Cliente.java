/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author S41-70
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private double saldo;
    private String ciudadOrigen;

    public Cliente(String rut, String nombre, String apellido, double saldo, String ciudadOrigen) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldo = saldo;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
    
    
    
}
