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
public abstract class IFriend {

    /**
     *
     * @param msj
     */
    protected IMediator mediator;
    protected String name;

    public IFriend(IMediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
            
    public abstract void send(String msj);
    public abstract void notify(String msj);
}
