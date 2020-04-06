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
public class BridgeTester {
        
        public static void testing(){
            System.out.println("-----------Prodando el Bridge--------------");
            //creamos las formas con su color
            Shape rect,trian;
            rect = new Rectangulo(new RedColor());
            trian = new Triangulo(new GreenColor());
            
            rect.draw();
            trian.draw();
            
        }


    
}
