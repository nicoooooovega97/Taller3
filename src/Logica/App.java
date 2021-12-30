/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S41-70
 */
public class App {
    public static void leerLocalizacion(SistemaStarkon sistema) throws IOException{
	File file = new File("localizacion.txt");
	Scanner arch = new Scanner(file);        
	while ( arch.hasNextLine()){
	    String linea = arch.nextLine();
            String [] partes = linea.split(",");
	    String nombre = partes[0];
	           
	    sistema.ingresarCiudad(nombre);  
	}
	arch.close();
    }
    
    public static void leerClientes(SistemaStarkon sistema) throws IOException{
	File file = new File("Cliente.txt");
	Scanner arch = new Scanner(file);        
	while ( arch.hasNextLine()){
	    String linea = arch.nextLine();
	    String [] partes = linea.split(",");
	    String rut= partes[0];
	    String nombre = partes[1];
	    String apellido = partes[2];
	    int saldo = Integer.parseInt(partes[3]);
	    String ciudadOrigen = partes[4];
	    sistema.ingresarCliente(rut, nombre, apellido, saldo, ciudadOrigen);  
	            
	}
	arch.close(); 
    }
    
    public static void leerEntregas(SistemaStarkon sistema) throws IOException{
	File file = new File("Entregas.txt");
	Scanner arch = new Scanner(file);        
	while ( arch.hasNextLine()){
            String linea = arch.nextLine();
            String [] partes = linea.split(",");
            int codigo = Integer.parseInt(partes[0]);
            String tipo = partes[1];
            String rutRemitente = partes[2];        
            String rutDestinatario = partes[3] ;
	            
            if(tipo=="D") {			
                double peso =Double.parseDouble(partes[4]);
                double grosor= Double.parseDouble(partes[5]);
		sistema.ingresarEnvioDocumento(codigo, rutRemitente, rutDestinatario, peso, grosor);
				
            }else {			
                if(tipo=="E") {			
                    double peso =Double.parseDouble(partes[4]);
                    double largo= Double.parseDouble(partes[5]);
                    double ancho =Double.parseDouble(partes[6]);
                    double profundidad= Double.parseDouble(partes[7]);			
                    sistema.ingresarEnvioEncomienda(codigo, rutRemitente, rutDestinatario, peso, largo, ancho, profundidad);
					
                }
					
                else {
						
                    if(tipo=="V") {			
                        String material= partes[4];	
                        double peso =Double.parseDouble(partes[5]);				
                        sistema.ingresarEnvioValija(codigo, rutRemitente, rutDestinatario, material, peso);
					
                    }			
                }		
            }      
            //sistema.asociarClienteEnvio(rutRemitente, codigo);
  
	        
        }      
        arch.close(); 
    }
	 
    public static void imprimirMenuCliente() {
        System.out.println("---------------------------menu---------------------------");
	System.out.println("opciones: (ingrese la letra)");
	System.out.println("A: Realizar una entrega");
	System.out.println("B: Recarga salgo");
	System.out.println("C: Información entregas ");
        System.out.println("D: Salir");
	System.out.println("----------------------------------------------------------");
    }

    public static void imprimirMenuAdmin() {
        System.out.println("---------------------------menu---------------------------");
	System.out.println("opciones: (ingrese la letra)");
	System.out.println("A: Entregas por tipo");
	System.out.println("B: Entregas por localización");
	System.out.println("C: Entregas por cliente");
	System.out.println("D: Registro de ganancias");
	System.out.println("E: Salir");
        System.out.println("----------------------------------------------------------");
    }
	   
    public static String formatearRut(String rut){
	int cont = 0;
        String format;
        rut= rut.replace(".", "");
        rut = rut.replace("-", "");
        format= "-" + rut.substring(rut.length()-1);
        for(int i = rut.length()-2; i>=0;i--){
            format=rut.substring(i,i+1)+format;    
            cont++;  
            if(cont==3 && i!=0){  
                format= "."+format;   
                cont=0;
            }    
        }    
        return format;
    }
    public static void imprimirMenu() {
	System.out.println("---------------------------menu---------------------------");
	System.out.println("opciones: (ingrese como RF#)");
	System.out.println("RF1: iniciar sesion ");
        System.out.println("RF2: registrar cliente ");
	System.out.println("RF3: Salir");
	    	
    }
    public static void RF3() {
	System.out.print("Gracias,Tenga un Buen Dia ");
	System.out.print("Adios :D");
    }

    public static void Menu(SistemaStarkon sistema){      
        imprimirMenu();     
        System.out.print("Ingrese opcion: ");      
        Scanner s = new Scanner(System.in);        
        String opcion = s.next();       
        boolean salir = false;     
        while(!opcion.equals("RF3")){      
            switch(opcion){ 
                case "RF1":
                    System.out.print("Ingrese rut: ");
                    s = new Scanner(System.in);
                    String rut = s.nextLine();
                    String nuevoRut = formatearRut(rut);
                    if(rut.equals("Admin")){
                        System.out.print("Ingres Clave: ");
                        String clave = s.nextLine();
                        if(clave.equals("choripan123")){
                            imprimirMenuAdmin(); 
                            System.out.print("Ingrese opcion: ");
                            String opcion3 = s.next();
                            while(!opcion3.equals("E")){
                                switch(opcion3){
                                case "A":
	                            //System.out.println(sistema.eliminarClinicasCovid());
                                    break;
	                        case "B":
	                            break;
	                        case "C":
	                            break;
	                        case "D":
	                            break;
	                    	case "E":
                                    salir = true;
                                    break;
                        	}
                            System.out.println( "\n" );
                            imprimirMenuAdmin();
                            System.out.print("Ingrese opcion: ");
                            opcion3 = s.next(); 
                            }
                        }
                        
                    }   
                    else{ 
                        String t = sistema.ValidarDatos(nuevoRut);
                        System.out.println(t);
                        if(t!=null){
                            if(t.equals("encontrado")){
                                imprimirMenuCliente();
                                System.out.print("Ingrese opcion: ");
                                String opcion1 = s.next();
                                while(!opcion1.equals("D")){  
                                    switch(opcion1){
                                        case "A":
	                                    break;
	                                case "B":
	                                    break;
	                                case "C":
	                                    System.out.println("--- AUN NO SE IMPLEMENTA ---");
	                                    break;
	                                case "D":
	                                    salir = true;
	                                    break;
	                            }
	                            System.out.println( "\n" );
	                            imprimirMenuCliente();
	                            System.out.print("Ingrese opcion: ");
	                            opcion1 = s.next();
	                        }
	                    }
	                }
                    }
                    break;
                    
                 case "RF2": 
                    Scanner p = new Scanner(System.in);
                    System.out.print("Ingrese rut: ");
                    String r1 = p.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre1 = p.nextLine(); 
                    System.out.print("Ingrese apellido: ");
                    String apellido1 = p.nextLine(); 
                    System.out.print("Ingrese ciudad: ");
                    String ciudad1 = p.nextLine(); 
                    sistema.ingresarCliente(r1, nombre1, apellido1, 0, ciudad1);
                    break;
                case "RF3": 
                    //sistema.escribirInformacion();     
                    salir = true;   
                    break;
                    
                    
            } 
            System.out.println( "\n" );        
            imprimirMenu();
            System.out.print("Ingrese opcion: ");
            opcion = s.next();          
    
        }         
        RF3();
	        
    }
    public static void main(String[] args) throws IOException {
	SistemaStarkon sistema = new SistemaStarkonImpl();
	       
	Menu(sistema);
	leerLocalizacion(sistema);
	leerClientes(sistema);
	leerEntregas(sistema);
	        
	    
    }
}
