/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fafre
 */
public class Directorio implements IComponent{
    
    private List<IComponent> hijos;
    private String nombre;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<IComponent>();
    }
    
    
    
    @Override
    public void addChild(IComponent hijo) {
        hijos.add(hijo);
    }

    @Override
    public boolean getChilds(int nivel) {
        //recorro los hijo
        nivel++;
        for (Iterator<IComponent> iterator = hijos.iterator(); iterator.hasNext();) {
            IComponent next = iterator.next();
            System.out.println("-nievel: "+nivel+" nodo: " +next.getName());
            next.getChilds(nivel);
        }
        return false;
    }

    @Override
    public boolean removeChild(IComponent hijo) {
        return this.hijos.remove(hijo);
    }


    public String getName() {
        return this.nombre;
    }
    
}
