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
public abstract class Envio {
    private int codigo;
    private String rutRemitente;
    private String rutDestinatario;

    public Envio(int codigo, String rutRemitente, String rutDestinatario) {
        this.codigo = codigo;
        this.rutRemitente = rutRemitente;
        this.rutDestinatario = rutDestinatario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRutRemitente() {
        return rutRemitente;
    }

    public void setRutRemitente(String rutRemitente) {
        this.rutRemitente = rutRemitente;
    }

    public String getRutDestinatario() {
        return rutDestinatario;
    }

    public void setRutDestinatario(String rutDestinatario) {
        this.rutDestinatario = rutDestinatario;
    }
    
    public abstract double calcularValor();
    

    
    
}
