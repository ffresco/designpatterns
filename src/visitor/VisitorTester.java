/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author fafre
 */
public class VisitorTester {
    public static void testitn(){
        System.out.println("------Probando el Visitor---------------");
        System.out.println("1-El visitor es mi clase que quiere entrar a la api de la clase a visitar y cambiar en este caso el valor del entero");
        //Creamos el visitador
        IVisitor visitador = new Visitor();
        //Creamos la clase del API la clase que es externa a mi sistema
        MyClass miClase = new MyClass();        
        System.out.println("Valor ariginal de mi clase :"+miClase.getIntValue());
        miClase.accept(visitador);
        System.out.println("Despues de visitar el valor es :"+miClase.getIntValue());
        
        
    }
    
}
