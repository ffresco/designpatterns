/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter.interpreter2;

/**
 *
 * @author fafre
 */
public class Interpreter2Tester {
    public static void testing(){
        System.out.println("--------------Probando una version mas completa Interpreter-------------------");
        String ecuacion = "1+2*3+3*4+1+2+3";
        System.out.println("Vamoa obtener el resultado de :" + ecuacion);
        
        //Creamos el interpretador
        Interpretador calculator = new Interpretador(ecuacion);
        System.out.println("---Pasamos la ecuancion a postfijo  :" + calculator.infixToPostFix());
        //ahora pido el resultado final
        System.out.println("----Le pedimos al interpretador el total : " + calculator.getTotal());
    }
}
