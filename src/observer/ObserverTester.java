/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author fafre
 */
public class  ObserverTester {
    public static void testing(){
        Observer o1 = new Observer();
        Observer o2 = new Observer();
        o1.setNombre("Objervador 1");
        o2.setNombre("Observador 2");
        Subject s1 = new Subject();
        s1.registrer(o2);
        s1.registrer(o1);
        s1.setFlag(2);
        
    }     
}
