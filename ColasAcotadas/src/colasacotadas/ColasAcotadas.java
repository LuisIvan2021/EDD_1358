/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colasacotadas;

/**
 *
 * @author ivan_
 */
public class ColasAcotadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColasAcotadas Personas = new ColasAcotadas(5);
        Personas.enqueue(1, "Pedro 5 años");
        Personas.enqueue(1, "Josefina 5 años");
        Personas.enqueue(4, "Timonel Jose ");
        Personas.enqueue(1, "Lucia 4 años");
        Personas.enqueue(3, "Miguel 54 años ");
        Personas.enqueue(2, "lucia 33 años ");
        Personas.enqueue(0, "Papa Francisco");
        Personas.enqueue(5, "Capitan Sparrow");
        System.out.println("A los botes querian subir:");
        System.out.println(Personas);

        System.out.println("LOGRO SALIR "+Personas.dequeue());
        System.out.println("LOGRO SALIR "+Personas.dequeue());
        System.out.println("LOGRO SALIR "+Personas.dequeue());
        System.out.println("LOGRO SALIR "+Personas.dequeue());
        System.out.println("LOGRO SALIR "+Personas.dequeue());
        System.out.println("Fallecieron");
        System.out.println(Personas);
       
    }
    
}
