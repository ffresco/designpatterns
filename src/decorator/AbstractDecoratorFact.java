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
public abstract class AbstractDecoratorFact implements IFacturaDecorator{
    
    private IFacturaDecorator factura;
            
    @Override
    public void imprimir() {
        factura.imprimir();        
    }

    public AbstractDecoratorFact(IFacturaDecorator factura) {
        this.factura = factura;
    }
    
      
    
    
}
