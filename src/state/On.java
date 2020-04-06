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
public class On implements IRemoteControl{
    
    @Override
    public void pressSwich(Tv tv) {
        tv.setState(new Off());
    }
    
}
