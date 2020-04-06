/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fafre
 */
public class ConcreteMediator implements IMediator{
    
    private Map<String,IFriend> amigos;

    public ConcreteMediator() {
        this.amigos = new HashMap<>();
                
    }
    
    @Override
    public void setIFriend(IFriend amigo){
        this.amigos.put(amigo.getClass().getName(),amigo);
    }
    
    
    @Override
    public void send(IFriend f, String msj) {
        String amgigoClass = f.getClass().getName();
        IFriend destino,jefe;
        jefe = this.amigos.get(Boss.class.getName());
        
        if (amgigoClass == null ? Friend1.class.getName() == null : amgigoClass.equals(Friend1.class.getName())) {
            destino = this.amigos.get(Friend2.class.getName());
            destino.notify(msj);
            jefe.notify(f.getName() + " Envio el mensaje " + msj + " a " + destino.getName());
        }
        
        if (amgigoClass == null ? Friend2.class.getName() == null : amgigoClass.equals(Friend2.class.getName())) {
            destino = this.amigos.get(Friend1.class.getName());
            destino.notify(msj);
            jefe.notify(f.getName() + " Envio el mensaje " + msj + " a " + destino.getName());
        }
        if (amgigoClass == null ? Boss.class.getName() == null : amgigoClass.equals(Boss.class.getName())) {
            destino = this.amigos.get(Friend2.class.getName());
            destino.notify(msj);
            jefe.notify(f.getName() + " Envio el mensaje " + msj + " a " + destino.getName());
            destino = this.amigos.get(Friend1.class.getName());
            destino.notify(msj);
            jefe.notify(f.getName() + " Envio el mensaje " + msj + " a " + destino.getName());
        }
        
    }


    
}
