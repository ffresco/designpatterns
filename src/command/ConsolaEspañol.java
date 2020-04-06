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
public class ConsolaEspañol implements IReceiver{

    public ConsolaEspañol() {
    }
    
    
    
    @Override
    public void saludar() {
        System.out.println("Hola Berracos soy bien castellano !!!");
    }

    @Override
    public void despedir() {
        System.out.println("Chau mikolios nos vemos !!!!");
    }
    
}
