/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author fafre
 */
public class FacadeTester {
    public static void testing(){
        System.out.println("----------------Probando el Facade----------------");
        PartyFacade pf = new PartyFacade(10, 4);
        pf.prepararParty();
    }
}
