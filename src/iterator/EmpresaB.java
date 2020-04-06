/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fafre
 */
public class EmpresaB implements ISubject {

    private List<String> empleados;
    
    public EmpresaB() {
        this.empleados = new LinkedList<String>();
        empleados.add("1- Miguel ");
        empleados.add("2- Roque ");
        empleados.add("3- Yamel ");
        
    }

    @Override
    public IIterator getConcreteIterator() {
        EmpresaBIterator iterator = new EmpresaBIterator(empleados);
        return iterator;
    }

    public List<String> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<String> empleados) {
        this.empleados = empleados;
    }
    
    public String imprimirCol(){
        return this.empleados.toString();
    }
    
    
    
}
