/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author ivan_
 */
public class Principal {
    public static void main(String[] args) {
        TablasHash numeros =new TablasHash(9);
        numeros.Add("HOLA MUNDO ");
        numeros.Add("HOLA MUNDO ");
        numeros.Add("JOse ");
        numeros.Add("Maria ");
        numeros.Add("Morelos ");
        numeros.Add("Pavon ");
        numeros.Add("Ana ");
        numeros.Add("Betillo");
        numeros.Add("Carlengues");
        numeros.Add("cacahuetes ");
        numeros.Add("Francisco");
        numeros.Add("guey");
        numeros.Add("QESO BABAS");
        numeros.Add("QESO BORNO");
       // System.out.println(numeros);
     //  numeros.Remove(72);
       //numeros.Remove(72);
       //numeros.Remove(72);
        numeros.Remove(97);
        System.out.println("/////");
        System.out.println(numeros);
        
      /*  for(int k=0;k<100;k++){
       //   System.out.println("/*"+k);
           if(numeros.primos(k)){
               System.out.println(k);
           } 
       
        }*/
    }
       
    
}
