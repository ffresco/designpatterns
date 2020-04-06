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
public class EmailRecibidor implements IRecibidor{
    private IRecibidor nextReciber;

    public EmailRecibidor(IRecibidor recibidor) {
        this.nextReciber = recibidor;
    }
    
    @Override
    public boolean procesarPedido(Mensaje msg) {
        if (msg.getTexto().contains("Email")) {
            System.out.println("El pedido : "+msg.getTexto() + "  fue procesado por el Mail handler. Finaliza el proceso");
            System.out.println("----Procesado con exito -------------");
            return true;
        } else {
            System.out.println("Mail handler no pudo con : "+msg.getTexto() + " , pasamos al siguiente en la cadena ");
            if (nextReciber==null) {
                System.out.println("Se llego al fin de la cadena");
                System.out.println("-----------Fin Cadena----------------");
                return false;
            }
            return nextReciber.procesarPedido(msg);
        }
    }
    
}
