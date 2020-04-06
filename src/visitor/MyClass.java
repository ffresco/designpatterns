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
public class MyClass implements IOriginalInterface {
    
    private int intValue=1;
    
    public MyClass() {
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public boolean accept(IVisitor visitor) {
        System.out.println("---Validando credenciales del visitador----");
        visitor.visit(this);
        return true;
    }
    
    
}
