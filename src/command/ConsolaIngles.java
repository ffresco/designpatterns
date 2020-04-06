/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author fafre
 */
public class ConsolaIngles implements IReceiver {

    public ConsolaIngles() {
    }
    
    
    
    @Override
    public void saludar() {
        System.out.println("Hello people !!!");
    }

    @Override
    public void despedir() {
        System.out.println("Good Bye people !!");
    }
    
}
