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
public class Tv {
    private IRemoteControl rc;
    
    public Tv(IRemoteControl rc) {
        this.rc = rc;
    }
    
    public void pressButon(){
        rc.pressSwich(this);
    }

    public IRemoteControl getState() {
        return rc;
    }

    public void setState(IRemoteControl rc) {
        this.rc = rc;
    }
    
    
}
