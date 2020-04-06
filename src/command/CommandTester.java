/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author fafre
 */
public class CommandTester {
    
   public static void testint(){
       System.out.println("----------Command PAttern-------------------");
       System.out.println("*Se creeara una consola (receiver en español y el usuario ejecutra sobre ella)");
       IReceiver consolaEsp = new ConsolaEspañol();
       ICommand saludComm = new SaludarCommand(consolaEsp);
       ICommand despComm = new DespedirCommand(consolaEsp);
       System.out.println("Ejecuto saludar ");
       saludComm.ejecutar();
       System.out.println("Ejecuto despedir");
       despComm.ejecutar();
       
       System.out.println("Ahora creo una consola en ingles");
       IReceiver consolaIng = new ConsolaIngles();
       ICommand saludCommI = new SaludarCommand(consolaIng);
       ICommand despCommI = new DespedirCommand(consolaIng);
       saludCommI.ejecutar();
       despCommI.ejecutar();
   }
    
}
