/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author S41-70
 */
public interface SistemaStarkon {
    public void ingresarCiudad(String nombre);
    
    public void ingresarCliente(String rut, String nombre, String apellido, double saldo, String ciudadOrigen);
    
    public void ingresarEnvioDocumento(int codigo, String rutRemitente, String rutDestinatario, double peso, double grosor);

    public void ingresarEnvioValija(int codigo, String rutRemitente, String rutDestinatario, String material, double peso);

    public void ingresarEnvioEncomienda(int codigo, String rutRemitente, String rutDestinatario, double peso, double largo, double ancho, double profundidad);
	
    public void asociarClienteEnvio(String rut, int codigo);
	
    public void realizarEntrega(String rutR, String rutD);
	
    public void recargarSaldo(String rutR,double saldoNuevo);
	
    public void obtenerEntregas();

    public void obtenerEntregasTipos();
	
    public void obtenerEntregasLocalizacion();
	
    public void obtenerEntregasCliente();
	
    public void obtenerRegistroGanancia();
	
    public String ValidarDatos(String rut);
    
}
