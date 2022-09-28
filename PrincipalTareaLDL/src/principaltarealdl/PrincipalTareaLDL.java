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
public class PrincipalTareaLDL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LDobleLig<Integer> j = new LDobleLig<>();
        j.agregarAlFinal(100);
        j.agregarAlFinal(50);
        j.agregarAlFinal(5);
        j.agregarAlFinal(56);
        j.agregarAlFinal(80);
        j.transversal();
        j.agregarAlInicio(12);
        j.transversal();
        j.agregarDespuesDe(7,2);
        j.transversal();
        j.eliminar(3);
        j.transversal();
        j.eliminarElPrimero();
        j.transversal();
        j.eliminarElFinal();
        j.transversal();
        System.out.println(j.buscar(56));
        j.actualizar(50, 8);
        j.transversal();
    }
    

}
