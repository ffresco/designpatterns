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
public class LargeRobot implements IRobot{
    
    private String color;
    
    public LargeRobot() {
    }
    
    
    @Override
    public void print() {
        System.out.println("-----Soy un LARGE ROBOT-----------" + this.color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
