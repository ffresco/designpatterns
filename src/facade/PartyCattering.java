/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author fafre
 */
public class PartyCattering {
    private int invitados;
    private int claseFiesta;

    public PartyCattering(int invitados, int claseFiesta) {
        this.invitados = invitados;
        this.claseFiesta = claseFiesta;
    }
    
    public String cattering(){
        return " Este es el cattering para invitados " + this.invitados + " clae fiesta " + this.claseFiesta;
    }
    
    
}
