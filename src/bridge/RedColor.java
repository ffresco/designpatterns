/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author fafre
 */
public class RedColor implements IColor{
  
    @Override
    public void fillWColor() {
        System.out.println("::Pintando color RED::"); 
    }
}
