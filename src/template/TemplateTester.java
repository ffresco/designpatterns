/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author fafre
 */
public class TemplateTester {
    
    public static void testing(){
        System.out.println("Probando el template");
        Pizza pV = new PizzaVegan();
        Pizza pTACC = new PizzaSinTACC();
        System.out.println("Pizaa vegui");
        pV.preparacionBase();
        System.out.println("Pizaa TACC");
        pTACC.preparacionBase();
    }
    
}
