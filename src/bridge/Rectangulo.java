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
public class Rectangulo extends Shape{

    public Rectangulo(IColor color) {
        super(color);
    }
    
    @Override
    public void draw() {
        System.out.println("Construyo el RECTANGULO");
        this.color.fillWColor();
    }

    @Override
    public void modifyBorder(int color, int ancho) {
        System.out.println("modificando bordo RECTANGULO a " + color );
    }
 
}
