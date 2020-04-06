/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento.undoredo;

/**
 *
 * @author fafre
 */
public class Originator {
    private String state;
    private Memento m;

    public Originator() {
    }

    public void updateState(String state) {
        System.out.println("cambiando estado en originator a " + state);
        this.state = state;
    }
    
    public Memento originatorMemento(){
        m = new Memento(state);
        return m;
    }
    
    public void undo(Memento meme){
        this.state = meme.getState();
    }
    
    public void redoo(Memento meme){
        this.state = meme.getState();
    }
}
