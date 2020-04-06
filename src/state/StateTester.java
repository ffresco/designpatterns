/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author fafre
 */
public class StateTester {
   public static void testing(){
       System.out.println("------------Probando un state pattern----------------");
       System.out.println("Creamos una tv y vemos su estado inicial ");
       IRemoteControl rc = new Off();
       Tv tv = new Tv(rc);
       System.out.println("Estado de la tv " + tv.getState().getClass());
       System.out.println("-----Apreto el boton de apgagado --------");
       tv.pressButon();
       System.out.println("Estado de la tv ahora " + tv.getState().getClass());
       
       
   }
}
