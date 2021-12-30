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
public class EnvioEncomienda extends Envio{
    private double peso;
    private double largo;
    private double ancho;
    private double profundidad;

    public EnvioEncomienda(int codigo,  String rutRemitente, String rutDestinatario,double peso, double largo,double ancho,double profundidad) {
        super(codigo, rutRemitente, rutDestinatario);
        this.peso =  peso;
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
                 
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public double calcularValor() {
        
        if(this.peso<=50  && this.largo<= 1.2 && this.ancho<= 0.8 && this.profundidad<= 0.8){
            return (this.peso*(this.largo*this.ancho*this.profundidad));
            
        }
        return 0;
               
    }
    
    
}
