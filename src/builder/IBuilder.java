/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author fafre
 */
public interface IBuilder {
    public void buildBody();
    public void insertWheels();
    public void addHeadLights();
    public Product getVehicule();
    
}
