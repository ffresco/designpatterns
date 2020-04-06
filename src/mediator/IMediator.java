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
public interface IMediator {
   
    public void send(IFriend f, String msj);
    public void setIFriend(IFriend amigo);
}
