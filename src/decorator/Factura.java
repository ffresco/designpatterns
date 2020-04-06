/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author fafre
 */
public class Factura implements IFacturaDecorator{

    @Override
    public void imprimir() {
        System.out.println("Soy la factura esta es la impresión original");
    }
    
}
