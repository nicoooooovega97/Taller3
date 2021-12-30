/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dominio.Ciudad;
import Dominio.Cliente;
import Dominio.Envio;
import Dominio.EnvioDocumento;
import Dominio.EnvioEncomienda;
import Dominio.EnvioValija;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author S41-70
 */
public class SistemaStarkonImpl implements SistemaStarkon{

      private ArrayList<Ciudad>    listaCiudades;
    private LinkedList<Cliente>  listaClientes;
    private ListaEnvios  listaEnvios;
    
    public SistemaStarkonImpl(){
        listaCiudades = new ArrayList<Ciudad>();
        listaClientes = new LinkedList<Cliente>();
        listaEnvios = new ListaEnvios();
    }

    @Override
    public void ingresarCiudad(String nombre) {
        Ciudad ciudad = new Ciudad(nombre);
        this.listaCiudades.add(ciudad);
    }

    @Override
    public void ingresarCliente(String rut, String nombre, String apellido, double saldo, String ciudadOrigen) {
        Cliente c = new Cliente(rut,nombre,apellido,saldo,ciudadOrigen);
        listaClientes.add(c);
    }

    @Override
    public void ingresarEnvioDocumento(int codigo, String rutRemitente, String rutDestinatario, double peso, double grosor) {
        Envio e = new EnvioDocumento(codigo,rutRemitente,rutDestinatario,peso,grosor);
        listaEnvios.ingresar(e);
        
    }

    @Override
    public void ingresarEnvioValija(int codigo, String rutRemitente, String rutDestinatario, String material, double peso) {
        Envio e = new EnvioValija(codigo,rutRemitente,rutDestinatario,material,peso);
        listaEnvios.ingresar(e);
    }

    @Override
    public void ingresarEnvioEncomienda(int  codigo, String rutRemitente, String rutDestinatario, double peso, double largo, double ancho, double profundidad) {
        Envio e = new EnvioEncomienda(codigo,rutRemitente,rutDestinatario,peso,largo,ancho,profundidad);
        listaEnvios.ingresar(e);
    }

    @Override
    public void asociarClienteEnvio(String rut, int codigo) {
         
    }

    @Override
    public void realizarEntrega(String rutR, String rutD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recargarSaldo(String rutR,double saldoNuevo) {
        for(Cliente c : listaClientes){
            if(c.getRut().equals(rutR)){
                c.setSaldo(c.getSaldo()+saldoNuevo);
            }
        }
    }

    @Override
    public void obtenerEntregas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerEntregasTipos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerEntregasLocalizacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerEntregasCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerRegistroGanancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String ValidarDatos(String rut) {
        String salida = " ";
        boolean encontrada = false;
        for(Cliente c : listaClientes){
            if(c.getRut().equals(rut)){
                encontrada = true;
                salida = "encontrado";
            }
            break;
        }
        
        return salida;
    }
    
    
    
}
