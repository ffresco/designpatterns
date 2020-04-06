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
public class ChainTester {
    public static void testing(){
        System.out.println("----------Probando la chain of Resp---------------");
        //primero armo la cadena entre los recibidores
        IRecibidor mailRec, faxRec;
        mailRec = new EmailRecibidor(null);
        faxRec = new FaxRecibidor(mailRec);
        Pedidor ped = new Pedidor(faxRec); //le tengo que enviar el que tiene siguiente
        
        //Ahora creamos 2 mensajes y los enviamos
        Mensaje emailMsg, faxMsg;
        emailMsg = new Mensaje("Este es un mensja de Email que estoy enviando  ");
        faxMsg = new Mensaje("Ahora voy mandondo este Fax ");
        
        //lo mando por la cadena  usando el pedidor
        ped.enviarPedido(faxMsg);
        ped.enviarPedido(emailMsg);
        ped.enviarPedido(new Mensaje("nuevo mensaje nadie podria procesarlo"));
        
        
    }
}
