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
public class Auto implements IBuilder{
    private Product pro;

    public Auto() {
       pro = new Product();
    }
    
    @Override
    public void buildBody() {
        pro.add("Cuerpoo de AUTO ---------");
    }

    @Override
    public void insertWheels() {
        pro.add("RUEDAS de AUTO ---------");
    }

    @Override
    public void addHeadLights() {
        pro.add("Luces  de AUTO ---------");
    }

    @Override
    public Product getVehicule() {
        return this.pro;
    }
    
    
    
}
