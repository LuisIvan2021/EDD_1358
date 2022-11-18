/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
/**
 *
 * @author ivan_
 */

public class ArrayADT <T>{
    int tamanio;
    ArrayList<T> datos;

    public ArrayADT(int tam) {
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio+1);
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.datos.get(indice);
        } else {
           // System.out.println("Fuera del rango");
        }
        return null;
    }

    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamanio;
    }

    public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.datos.set(indice, dato);
        } else {
          //  System.out.println("Fuera rango");
        }
    }

    public int getLongitud() {
        return this.tamanio;
    }

    public void limpiar(T dato) {
        for (int i = 0; i < this.tamanio; i++) {
            this.datos.set(i, dato);
        }
    }
    public void agragar(T dato){
        this.datos.add(dato);
    }
    
    public String toString(){
        String estado = "------------- "+this.tamanio+" -------------\n";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString()+"\n";
            }
        }
        return estado;
}}