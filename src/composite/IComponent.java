/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.List;

/**
 *
 * @author fafre
 */
public interface IComponent {
    public void addChild(IComponent hijo);
    public boolean getChilds(int nivel);
    public boolean removeChild(IComponent hijo);
    public String getName();
    
}
