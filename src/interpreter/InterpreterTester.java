/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fafre
 */
public class InterpreterTester {
    public static void testing(){
        System.out.println("-------------------------probando el interpreter------------------------");
        Interpreter inter = new Interpreter();
        System.out.println("Este es el resultado :" + inter.calcular("2+3*4+1+10+10+10*10"));
        
        
                 
    }
}
