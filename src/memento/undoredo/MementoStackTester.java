/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.undoredo;

/**
 *
 * @author fafre
 */
public class MementoStackTester {
    public static void testing(){
        //Inicializamos el originator y el caretaker 
        Originator or = new Originator();
        CareTaker ct = new CareTaker();
        
        //vamos poniendo estados y los guardamos
        or.updateState("Estado 1");
        ct.setMemento(or.originatorMemento());
        
        or.updateState("Estado 2");
        ct.setMemento(or.originatorMemento());
        
        or.updateState("Estado 3");
        ct.setMemento(or.originatorMemento());
        
        or.updateState("Estado 4");
        ct.setMemento(or.originatorMemento());
        
        or.updateState("Estado 5");
        ct.setMemento(or.originatorMemento());
        
        or.updateState("Estado 6");
        ct.setMemento(or.originatorMemento());
        
        ct.imprimirColas();
        
        //quito 2 estados
        System.out.println("----Performo 2 undoo------");
        or.undo(ct.getMementoUndo());
        or.undo(ct.getMementoUndo());
        ct.imprimirColas();
        //realizo 1 redoo
        System.out.println("---Haciendo un redoo-----");
        or.redoo(ct.getMementoRedo());
        ct.imprimirColas();
        //cambiando el estado
        System.out.println("---Cambiando el estado, se deberia perder la cola redoo----");
        or.updateState("Estado AA1");
        ct.setMemento(or.originatorMemento());
        ct.imprimirColas();
        or.redoo(ct.getMementoRedo());
        ct.imprimirColas();
        
        
       
        
        
    }
}
