/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.List;

/**
 *
 * @author fafre
 */
public class Archivo implements IComponent{

    private String name;

    public Archivo(String name) {
        this.name = name;
    }
    
    
    @Override
    public void addChild(IComponent hijo) {
        System.out.println("llegamos a una hoja no hay Hijos mi nombre es " + this.name);
    }

    @Override
    public boolean getChilds(int nivel) {
        return false;
    }

    @Override
    public boolean removeChild(IComponent hijo) {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
