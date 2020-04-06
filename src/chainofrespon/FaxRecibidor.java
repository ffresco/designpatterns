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
public class FaxRecibidor implements IRecibidor{
    
    private IRecibidor nextReciber;

    public FaxRecibidor(IRecibidor recibidor) {
        this.nextReciber = recibidor;
    }
    
    
    @Override
    public boolean procesarPedido(Mensaje msg) {
        if (msg.getTexto().contains("Fax")) {
            System.out.println("El pedido: "+msg.getTexto() + " fue procesado por el Fax handler. Finaliza el proceso");
            System.out.println("----Procesado con exito -------------");
            return true;
        } else {
            System.out.println("Fax handler no pudo : "+msg.getTexto() + " , pasamos al siguiente en la cadena ");
            if (nextReciber==null) {
                System.out.println("Se llego al fin de la cadena");
                System.out.println("-------Fin cadena----------------");
                return false;
            }
            return nextReciber.procesarPedido(msg);
        }
    }
    
}
