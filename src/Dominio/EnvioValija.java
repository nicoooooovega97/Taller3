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
public class EnvioValija extends Envio{
    private String material;
    private double peso;

    public EnvioValija(int codigo, String rutRemitente, String rutDestinatario,String material, double peso) {
        super(codigo,  rutRemitente, rutDestinatario);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double calcularValor() {
        
        if(this.peso<= 2  ){
            if(this.material.equals("Cuero")){
                return (this.peso*150*200);
            }
            else{
                if(this.material.equals("Plastico")){
                    return (this.peso*150*150);
                }
                else{
                    if(this.material.equals("Tela")){
                        return (this.peso*150*100);
                    }
                        
                }
            }
            
        }
        return 0;
    }
    
    
}
