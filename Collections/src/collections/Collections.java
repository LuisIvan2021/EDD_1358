/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author ivan_
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
   list.add("cheto"); //.add agrega un elemento a la lista
   list.add("papa");
   list.add("verdura");
   list.add("fideos");
   System.out.println(list);
   list.remove("cheto");    //.remove sirve para remover un elemento en concreto de la lista
   System.out.println(list);
    //---------------------------------------
    LinkedList L=new LinkedList();
    L.add("tracer"); //.add agrega un elemento a la lista
    L.add("hanzo");
    L.add("Junkrat");
    System.out.println(L);
        L.clear(); //.clear elimina todos los elementos de la lista
        System.out.println(L);
        //---------------------------------------
        Stack nombre =new Stack();
        nombre.add("IVAN");
        nombre.add("Carmen");
        nombre.add("Anastacio");
        System.out.println(nombre.pop()); // elimina el último elemento de un array y lo devuelve
        System.out.println(nombre.pop());
    }
    
}
