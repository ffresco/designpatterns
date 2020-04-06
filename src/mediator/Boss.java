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
public class Boss extends IFriend{

    public Boss(IMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msj) {
        this.mediator.send(this, msj);
    }

    @Override
    public void notify(String msj) {
        System.out.println("Soy " + this.name + " e intercepte este envio de mensajes --> " + msj);
    }
    
}
