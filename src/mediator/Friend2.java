/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author fafre
 */
public class Friend2 extends IFriend{

    public Friend2(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msj) {
        this.mediator.send(this, msj);
    }

    @Override
    public void notify(String msj) {
        System.out.println("Soy " + this.name + " y estoy recibiendo este mensaje " + msj);
    }
    
}
