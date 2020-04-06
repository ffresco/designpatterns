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
public class BuilderTester {
    public static void testing() {
        System.out.println("----------Probando el builder------------");
        //Creamos al director
        Director dir = new Director();
        
        //creamos de armadores de productos
        Auto auto = new Auto();
        Moto moto = new Moto();
        
        //Ahora le peidmos al director que construya
        dir.construir(moto);
        dir.construir(auto);
        
        //ahora le pedimos a los objetos armadores que nos devuelvan el producto y lo impriman
        moto.getVehicule().show();
        auto.getVehicule().show();
    }
}
