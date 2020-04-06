/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author fafre
 */
public interface ISubject {
    public void registrer(Observer ob);
    public void unRegistrer (Observer ob);
    public void notifyObservers();
    
}
