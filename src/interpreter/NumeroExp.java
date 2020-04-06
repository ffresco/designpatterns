/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.List;

/**
 *
 * @author fafre
 */
public class NumeroExp implements IExpresion{
    
    private IExpresion exp;
    private int valor;

    public NumeroExp(int value) {
       valor = value;
    }

    @Override
    public int resolve() {
        return this.valor;
    }

    @Override
    public void addExpresion(IExpresion exp) {
        this.exp = exp;
    }
    
    
    
    
}
