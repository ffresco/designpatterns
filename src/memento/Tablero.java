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
public class Tablero {
    private String indicador1;
    private Memento m;
    
    

    public Tablero() {

    }
    
    public void actualizaTablero(String indic1){
        this.indicador1 = indic1;
       
    }
    
     
    public void undo(Memento m){
        this.indicador1 = m.getEstado();
    }
    
    public void imprimirEstado(){
        System.out.println("Mi estado es : " + this.indicador1);
    }
    
    public Memento getTableroMemento(){
        m = new Memento(indicador1);
        return m;
    }
}
    