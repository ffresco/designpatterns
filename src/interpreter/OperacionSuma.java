/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fafre
 */
public class OperacionSuma implements IExpresion{
    
    private List<IExpresion> expresiones;

    public OperacionSuma() {
        this.expresiones = new ArrayList<>();
    }
    
    
    @Override
    public int resolve() {
        int resultado = 0;
        for (Iterator<IExpresion> iterator = expresiones.iterator(); iterator.hasNext();) {
            IExpresion next = iterator.next();
            resultado+=next.resolve();
            
        }
        return resultado;
    }

    @Override
    public void addExpresion(IExpresion exp) {
        this.expresiones.add(exp);
    }
    
    
}
