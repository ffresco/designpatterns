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
public class Visitor implements IVisitor{

    public Visitor() {
    }

    @Override
    public void visit(MyClass myclass) {
        System.out.println("----Realizando la visita y modificando el valor de my class-------");
        myclass.setIntValue(19999);
     }
    
}
