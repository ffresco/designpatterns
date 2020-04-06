/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofrespon;

/**
 *
 * @author fafre
 */
public class Pedidor {
    private IRecibidor recibidor;

    public Pedidor(IRecibidor recibidor) {
        this.recibidor = recibidor;
    }
    
    public void enviarPedido(Mensaje msg){
        if (recibidor!=null) {
            recibidor.procesarPedido(msg);
        }else{
            System.out.println("--Fin de la cadena---");
        }
        
    }
}
