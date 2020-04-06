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
public class AddExp extends NonTerminalExp implements IExpresion {

    public AddExp(IExpresion leftN, IExpresion rightN) {
        super(leftN, rightN);
    }

    @Override
    public int evaluate() {
        return leftN.evaluate() + rightN.evaluate();
    }
    
}
