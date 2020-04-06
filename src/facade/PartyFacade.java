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
public class PartyFacade {
    private PartyCattering pcat;
    private PartySouvenir psou;
       
    private int invitados;
    private int claseFiesta;

    public PartyFacade(int invitados, int claseFiesta) {
        this.invitados = invitados;
        this.claseFiesta = claseFiesta;
        this.pcat = new PartyCattering(invitados,claseFiesta);
        this.psou = new PartySouvenir(invitados, claseFiesta);
    }
    
    public void prepararParty(){
        System.out.println(pcat.cattering());
        System.out.println(psou.souvenir());
    }
}
