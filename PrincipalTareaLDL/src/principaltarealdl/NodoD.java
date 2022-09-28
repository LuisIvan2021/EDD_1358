/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principaltarealdl;

/**
 *
 * @author ivan_
 */
public class NodoD <T> {
    private T dato;
    private NodoD <T>  siguiente;
    private NodoD <T>  anterior;

    public NodoD (){
    }
    
    public NodoD (T valor) {
        this.dato = valor;
    }

    public NodoD (T dato, NodoD <T>  siguiente,NodoD <T>  anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NodoD <T>  getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoD <T>  siguiente) {
        this.siguiente = siguiente;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setAnterior(NodoD<T> anterior) {
        this.anterior = anterior;
    }

    public T getDato() {
        return dato;
    }

    public NodoD<T> getAnterior() {
        return anterior;
    }

    @Override
    public String toString() {
        return "{"  + dato + "}<-->";
    }
    
    
}
