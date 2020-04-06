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
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }
    
    public abstract void draw();
    public abstract void modifyBorder(int color, int ancho);
    
}
