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
public class NodoEnvio {
  private NodoEnvio next;
  private NodoEnvio prev;
  private Envio envio;

  public NodoEnvio(Envio envio){
    this.next = null;
    this.prev = null;
    this.envio = envio;
  }

  public NodoEnvio getNext() {
    return next;
  }

  public void setNext(NodoEnvio next) {
    this.next = next;
  }

  public NodoEnvio getPrev() {
    return prev;
  }

  public void setPrev(NodoEnvio prev) {
    this.prev = prev;
  }

  public Envio getEnvio() {
    return envio;
  }

  public void setEnvio(Envio envio) {
    this.envio = envio;
  }
}
