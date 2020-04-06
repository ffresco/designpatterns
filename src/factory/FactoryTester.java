/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fafre
 */
public class FactoryTester {
    public static void testing(){
        System.out.println("-----------Probando a Factory----------------");
        IFactory fc = new ConcreteFactory();
        IConnection cSql = null, cOracle = null;
        try {
            cSql = fc.getInstance(IFactory.SQL);
            cOracle = fc.getInstance(IFactory.ORACLE);
        } catch (Exception ex) {
            Logger.getLogger(FactoryTester.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       cSql.connect();
       cOracle.connect();
      
    }
}
