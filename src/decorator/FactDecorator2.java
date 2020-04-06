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
public class FactDecorator2 extends AbstractDecoratorFact{

    public FactDecorator2(IFacturaDecorator factura) {
        super(factura);
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Le agregamos esta linea del decorator 2  22222");
    }
    
}
