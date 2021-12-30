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
public class EnvioDocumento extends Envio{
    private double peso;
    private double grosor;

    public EnvioDocumento(String codigo, String rutRemitente, String rutDestinatario,double peso,double grosor) {
        super(codigo, rutRemitente, rutDestinatario);
        this.peso = peso;
        this.grosor = grosor;
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    @Override
    public double calcularValor() {
        
        if(this.peso<=1.5  && this.grosor<= 5){
            return (this.peso*this.grosor*100);
            
        }
        return 0;
    }
    
    
}
