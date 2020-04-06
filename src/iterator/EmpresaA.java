/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author fafre
 */
public class EmpresaA implements ISubject{
    private String[] empleados;

    public EmpresaA() {
        this.empleados = new String[4];
        empleados[0] = "1- Juan Carlos";
        empleados[1] = "2- Pepe";
        empleados[2] = "3- Fiori";
        empleados[3] = "4- Carlos";
        
        
    }

    @Override
    public IIterator getConcreteIterator() {
        EmpresaAIterator iterator = new EmpresaAIterator(empleados);
        return iterator;
    }

    public String[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[] empleados) {
        this.empleados = empleados;
    }
    
    public String imprimirCol(){
        String resultado = "";
        for (int i = 0; i < empleados.length; i++) {
            resultado += empleados[i] + "--";
        }
        return  resultado;
    }
    
    
    
    
    
}
