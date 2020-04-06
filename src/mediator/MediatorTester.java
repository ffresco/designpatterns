/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author fafre
 */
public class MediatorTester {
    public static void testing(){
        System.out.println("----------------Mediator pattern test----------------");
        IMediator mediator = new ConcreteMediator();
        IFriend amigo1 = new Friend1(mediator, "Amigo 1");
        IFriend amigo2 = new Friend2(mediator, "Amigo 2");
        IFriend jefe = new Boss(mediator, "Jefe ");
        
        String amigos = amigo1.getName() + amigo2.getName() + jefe.getName();
        System.out.println(amigos);
        
        //cargamos amigos al mediador
        mediator.setIFriend(amigo1);
        mediator.setIFriend(amigo2);
        mediator.setIFriend(jefe);
        
        //Testeo 
        jefe.send("hola");
        amigo1.send("Yo soy el amigo one y mando HELLO ");
        amigo2.send("Yo mando que onda !!! ");
        
        
        
        
        
    }
}
