/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author fafre
 */
public interface IOriginalInterface {
    public boolean accept(IVisitor visitor);
}
