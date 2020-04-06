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
public class FactDecorator1 extends AbstractDecoratorFact{

    public FactDecorator1(IFacturaDecorator factura) {
        super(factura);
    }

    @Override
    public void imprimir() {
        super.imprimir(); 
        System.out.println("Le agregamos una Linea del decorator 1");
    }
    
    
    
}
