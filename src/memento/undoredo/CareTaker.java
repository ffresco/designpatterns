/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.undoredo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 *
 * @author fafre
 */
public class CareTaker {
    private final Deque undoo;
    private final Deque redoo;
    private Memento lastknow;
    private static final int SIZE = 3;


    public CareTaker() {
        undoo = new ArrayDeque<>();
        redoo = new ArrayDeque<>();
    }
    
    public void setMemento(Memento m){
        
        //como la cola es acotada asi no guardo tantos estados me fjo, si llegue al maximo quito el elemento de mas abajo de la pila
        if (this.undoo.size()> SIZE) {
            Memento element = (Memento) undoo.pollLast();
            System.out.println("La cola de undoo llego al maximo se quita el primer elmento " + element.getState());
        }
        
        //agrego el memento recibido
        undoo.push(m);
        //como se hizo una nueva operacion vacio la cola de redoo 
        redoo.removeAll(redoo);
    }
    
    public Memento getMementoUndo(){
        Memento mObtenido;
        if (undoo.isEmpty()) {
            System.out.println("ya no hay mas operacion undoo guardadas ");
            mObtenido = this.lastknow;
        } else {
            mObtenido = (Memento) undoo.pop();
            redoo.push(mObtenido);
            this.lastknow = mObtenido;
        }
        return mObtenido;
    }
    
    public Memento getMementoRedo(){
       Memento mObtenido;
        if (redoo.isEmpty()) {
            System.out.println("No hay mas REHACER guardado");
            mObtenido = this.lastknow;
        }else{
            mObtenido = (Memento) redoo.pop();
            undoo.push(mObtenido);
            this.lastknow = mObtenido;
        }
        
       return mObtenido; 
    }
    
    public void imprimirColas(){
        System.out.println("----Cola undooo----------");
        
        for (Iterator iterator = undoo.iterator(); iterator.hasNext();) {
            Memento next = (Memento) iterator.next();
            System.out.println("undoo " + next.getState());
        }
        
        System.out.println("-----Cola redoo-----------");
        for (Iterator iterator = redoo.iterator(); iterator.hasNext();) {
            Memento next = (Memento)iterator.next();
            System.out.println("redoo " + next.getState());
        }
    }
    
    
    
}
