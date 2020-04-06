/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author fafre
 */
public class EmpresaBIterator implements IIterator{
    //es una copia de la lista de la clase original para trabajar sin joderla
    private List<String> listaInterna;
    private ListIterator<String> iterador;
    private String lastElement;

    public EmpresaBIterator(List<String> listaInterna) {
        this.listaInterna = (List<String>) ((LinkedList)listaInterna).clone();
        iterador = listaInterna.listIterator();
    }

    @Override
    public boolean hasNext() {
        return iterador.hasNext();
    }

    @Override
    public Object next() {
        this.lastElement = iterador.next();
        return lastElement;
    }

    @Override
    public Object currentElement() {
        return this.lastElement;
    }

    @Override
    public void goFirst() {
       iterador = listaInterna.listIterator();
       this.lastElement = listaInterna.get(0);
    }
    
    
}
