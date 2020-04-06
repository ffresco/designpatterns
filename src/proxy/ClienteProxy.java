/*
 * La idea seria crear el proxy con el id del objeto concreto, de esta manera, cuando necesito al objeto
 * concreto, me voy a busarlo a la base o a memoria con el id y lo creo completo 
 */
package proxy;

/**
 *
 * @author fafre
 */
public class ClienteProxy implements ICliente {
    private Cliente cliente;
    private int idCliente;

    public ClienteProxy(int id) {
        this.idCliente = id;
    }
    
    

    @Override
    public void informarDatos() {
        System.out.println("Pasando a traves del proxy");
        //lazy initialization
        if (cliente==null) {
            //aca fuerzo en una app real con el id cargado iria a la base a buscar los datos para ese id
            cliente = new Cliente("Juan");
            cliente.setId(1);
        }
        
        cliente.informarDatos();
    }
    
}
