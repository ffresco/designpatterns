/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author fafre
 */
public class SmallRobot implements IRobot{
    
    private String color;
    
    public SmallRobot() {
    }
    
    
    
    @Override
    public void print() {
        System.out.println("-----Soy un SMALL ROBOT 000000------------" + this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        
        this.color = color;
    }
    
    
    
}
