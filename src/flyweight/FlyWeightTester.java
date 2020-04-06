/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.Random;

/**
 *
 * @author fafre
 */
public class FlyWeightTester {
    public static void testing(){
        System.out.println("-----------Probando el FlyWeight--------------");
        //creo la fabrica de robots
        RobotFactory rf = new RobotFactory();
        
        //trato de crear varios robos small y luego veo cuantos se crearon
        for (int i = 0; i < 5; i++) {
            IRobot sr = rf.getRobotFromFactory(RobotFactory.SMALL);
            sr.setColor(getRandomColor());
            sr.print();
            
        }
        
        for (int i = 0; i < 5; i++) {
            IRobot lr = rf.getRobotFromFactory(RobotFactory.LARGE);
            lr.setColor(getRandomColor());
            lr.print();
            
        }
        
        //veo cuantos robots se crearon
        System.out.println(" Total creados " + rf.totalObjectsCreated());
        
        
        
    }
    
    private static String getRandomColor(){
        String color;
        Random rd = new Random();
        int generatedNumber = rd.nextInt(20);
        if (generatedNumber%2==0) {
            color = "BLUE";
        }else{
            color = "RED";
        }
        
        return color;
    }
}
