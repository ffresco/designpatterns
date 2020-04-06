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
public class TerminalExp implements IExpresion{
    
    private int value;

    public TerminalExp(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
    
    
}
