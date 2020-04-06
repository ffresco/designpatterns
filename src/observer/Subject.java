/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fafre
 */
public class Subject implements ISubject {
    private int flag;
    private List<Observer> observers = new ArrayList<Observer>();
    
    @Override
    public void registrer(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void unRegistrer(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Iterator<Observer> iterator = observers.iterator(); iterator.hasNext();) {
            Observer next = iterator.next();
            next.update();
            
        }
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        //aca notifico 
        this.notifyObservers();
    }
    
    
    
}
