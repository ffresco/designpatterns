/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter.interpreter2;

/**
 *
 * @author fafre
 */
public abstract class NonTerminalExp {
    protected IExpresion leftN;
    protected IExpresion rightN;

    public NonTerminalExp(IExpresion leftN, IExpresion rightN) {
        this.leftN = leftN;
        this.rightN = rightN;
    }
    
    
    
}
