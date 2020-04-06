/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author fafre
 */
public interface IIterator {
    public boolean hasNext(); //para ver si llegamos al final
    public Object next(); //retorna el siguiente elemento
    public Object  currentElement(); //retorna elemento actual
    public void goFirst(); //vuelve al comienzo de la lista
    
}
