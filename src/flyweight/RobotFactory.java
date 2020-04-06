/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fafre
 */
public class RobotFactory {
    
    public static final String LARGE = "LARGE";
    public static final String SMALL = "SMALL";
    private Map<String, IRobot> robots;
    
    public RobotFactory() {
        robots = new HashMap<String,IRobot>();
    }
    
    public int totalObjectsCreated(){
        return robots.size();
    }
    
    public IRobot getRobotFromFactory(String type){
        IRobot robot = null;
        
        if (robots.containsKey(type)) {
            return robots.get(type);
        }
        switch (type) {
            case SMALL:
                robot = new SmallRobot();
                break;
            case LARGE:
                robot = new LargeRobot();
                break;
            default:
                throw new AssertionError();
        }
      
        this.robots.put(type, robot);
        return robot;          
        
    }
    
    
}
