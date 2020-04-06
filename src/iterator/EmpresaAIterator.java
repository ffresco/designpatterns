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
public class EmpresaAIterator implements IIterator {
    private String[] listaInterna;
    private int indice = 0;
    private Object currentObj;

    public EmpresaAIterator(String[] listaInterna) {
        this.listaInterna = listaInterna.clone();
        currentObj = this.listaInterna[0];
    }

    @Override
    public boolean hasNext() {
        return indice < listaInterna.length;
    }

    @Override
    public Object next() {
        this.currentObj = listaInterna[indice];
        indice++;
        return currentObj;
    }

    @Override
    public Object currentElement() {
        return  this.currentObj;
    }

    @Override
    public void goFirst() {
        indice = 0;
        currentObj = listaInterna[indice];
    }
    
    
}
