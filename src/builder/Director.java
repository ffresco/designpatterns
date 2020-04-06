/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author fafre
 */
public class Director {

    private IBuilder miBuilder;
            
    public Director() {
    }
    
    public void construir(IBuilder ib){
        miBuilder = ib;
        miBuilder.buildBody();
        miBuilder.addHeadLights();
        miBuilder.insertWheels();
        
    }
}
