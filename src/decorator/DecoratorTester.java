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
public class DecoratorTester {
    public static void testing(){
        System.out.println("Probando el decorador");
        Factura fact = new Factura();
        FactDecorator1 d1 = new FactDecorator1(fact);
        FactDecorator2 d2 = new FactDecorator2(d1);
        
        //imprimo desde la factura
        System.out.println("-----Desde la factura-------");
        fact.imprimir();
        //imprimo desde el decorator 1 deberia agregar algo manteniendo lo de la factura
        System.out.println("-----Desde el decorator 1-------");
        d1.imprimir();
        //imprimo dedde el decorador 2
        System.out.println("-----Desde el deocrator 2-------");
        d2.imprimir();
        
        
    }
    
}
