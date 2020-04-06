/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author fafre
 */
public class Memento {
    private String indic1;

    public Memento(String indic1) {
        this.indic1 = indic1;
    }
    
        
    public String getEstado(){
        return this.indic1;
    }
    

    
    
    
}
