/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author fafre
 */
public class MementoTester {
    public static void testing(){
        System.out.println("-------probando un stack-----------------");
        Deque pila = new ArrayDeque<>(1);
        pila.push("1-Fernando");
        pila.push("2-Miguel");
        pila.push("3-Maikol");
        
   
     
        //voy a tratar de quitar la base de la pila (perfecto esto me sirve para hacer pila circular
        System.out.println("Haciendo un poll first " +pila.pollLast());
        for (Iterator iterator = pila.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
            
        }
        

        
        System.out.println("-------------Probando a Memento---------------");
        //inicializamos el tablero
        Tablero tb = new Tablero();
        tb.actualizaTablero("Estado Inicial");
        //ponemos el estado al tablero
        
        //guardamos el estado
        CareTaker ct = new CareTaker();
        ct.setMemento(tb.getTableroMemento());
        tb.imprimirEstado();
        
        //cambiamos el estado
        tb.actualizaTablero("Estado 2");
        tb.imprimirEstado();
        
        //hacemos un revert o undo
        System.out.println("Hago un undo");
        tb.undo(ct.getMemento());
        tb.imprimirEstado();
        System.out.println("---------Fin Memento---------------------------------");
            
        
    }
}
