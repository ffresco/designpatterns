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
public class PartySouvenir {
    private int invitados;
    private int claseFiesta;

    public PartySouvenir(int invitados, int claseFiesta) {
        this.invitados = invitados;
        this.claseFiesta = claseFiesta;
    }
    
    public String souvenir(){
        return " Este es el souvenir para la cantidad de invitaods "+ String.valueOf(invitados) +
                "-Clase de fiesta - " + this.claseFiesta;
              
    }
}
