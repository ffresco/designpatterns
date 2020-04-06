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
public class Friend1 extends IFriend{

    public Friend1(IMediator mediator, String name) {
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
