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
public class Moto implements IBuilder{
    private Product pro;

    public Moto() {
        pro = new Product();
    }

    @Override
    public void buildBody() {
        pro.add("Cuerpoo de MOTO ******");
    }

    @Override
    public void insertWheels() {
        pro.add("RUEDAS de MOTO ******");
    }

    @Override
    public void addHeadLights() {
        pro.add("Luces  de MOTO ******");
    }

    @Override
    public Product getVehicule() {
        return this.pro;
    }
    
    
}
