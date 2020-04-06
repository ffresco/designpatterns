/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author fafre
 */
public class CompositeTester {
    public static void testing(){
        System.out.println("--------------Probando al composite-------------------");
        //Creamos los nodos
        IComponent nodoA, nodoAA, nodoAB, nodoAAA, nodoAAB;
        nodoA = new Directorio("nodo A");
        nodoAA = new Directorio("nodo A.A");
        nodoAB = new Directorio("nodo A.B");
        nodoAAA = new Directorio("nodo A.A.A");
        nodoAAB = new Directorio("nodo A.A.B");
        

        
        //anidando hijos
        nodoAAA.addChild(new Archivo("Archivo aaa 1"));
        nodoAAA.addChild(new Archivo("Archivo aaa 2"));
        nodoAA.addChild(nodoAAA);
        nodoAA.addChild(nodoAAB);
        nodoA.addChild(nodoAA);
        nodoA.addChild(nodoAB);
        
        //Imprimir
        int nivel = 1;
        System.out.println("-nivel : " + nivel + " nodo: " + nodoA.getName());
        nodoA.getChilds(1);
        
        
    }
}
