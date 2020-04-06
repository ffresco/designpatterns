/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fafre
 */
public interface IExpresion {
    public int resolve();
    public void addExpresion(IExpresion exp);
    
}
