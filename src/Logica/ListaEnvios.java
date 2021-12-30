/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Dominio.Envio;

/**
 *
 * @author S41-70
 */
public class ListaEnvios {
    private NodoEnvio first;
    private NodoEnvio last;

    public ListaEnvios(){
        this.last = null;
        this.first = null;
    }


    //lista Circular Doble
    public void ingresar(Envio envio){
        NodoEnvio nuevo = new NodoEnvio(envio);
        if(isEmpty()){
            this.last = nuevo;
            this.first = nuevo;
            nuevo.setNext(this.first);
            nuevo.setPrev(this.last);
        }
        else{
            nuevo.setNext(this.first);
            this.first.setPrev(nuevo);
            nuevo.setPrev(this.last);
            this.last.setNext(nuevo);
            this.first = nuevo;
        }
    }

    public boolean buscar(int codigo){
        NodoEnvio aux = this.first;
        while(aux != this.last){
            if(aux.getEnvio().getCodigo() == codigo){
                aux = aux.getNext();
                return true;
            }
        }
        if(aux.getEnvio().getCodigo() == codigo){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(this.last == null && this.first == null) {
            return true;
        }
        else{
            return false;
        }
    }

    public void mostrarLista(){
        NodoEnvio aux = this.first;
        while(aux != this.last){
            System.out.println(aux.getEnvio().getCodigo());
            aux = aux.getNext();
        }
        System.out.println(aux.getEnvio().getCodigo());
    }

    public NodoEnvio getFirst() {
        return first;
    }

    public void setFirst(NodoEnvio first) {
        this.first = first;
    }

    public NodoEnvio getLast() {
        return last;
    }

    public void setLast(NodoEnvio last) {
        this.last = last;
    }
    

}
