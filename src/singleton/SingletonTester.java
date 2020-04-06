/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author fafre
 */
public class SingletonTester {
    
    public static void testing(){
        System.out.println("trataremos de crear 2 instancias y vemos que mantine el nombre");
        MakeASingleton a = MakeASingleton.getInstance();
        a.setNombre("primer instancia");
        System.out.println("primera creacion " + a.getNombre());
        MakeASingleton b = MakeASingleton.getInstance();
        System.out.println("seguda creacion " + b.getNombre());
        System.out.println(a.hashCode() + "--" + b.hashCode());
    }
    
}
