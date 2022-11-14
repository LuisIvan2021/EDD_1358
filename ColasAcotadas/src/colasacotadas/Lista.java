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
public class Lista {
    this.elements = new ArrayList<>();
    }

    public boolean is_empty() {
return this.elements.isEmpty();
    }
    public void enqueue(T valor){
     this.elements.add(valor);
    }
    public T dequeue(){
        if(is_empty()){
            return (T) "LA COLA ESTA BACIA!!!";
        }else{
            T aux=elements.get(0);
           elements.remove(0);
            return aux;
        }
    }
    public int tamaño(){
        return elements.size();
    }

    @Override
    public String toString() {
        for (int i=0;i<elements.size();i++){
            System.out.println  ("["+elements.get(i)+"]");
        }
        return "";
    }
}
