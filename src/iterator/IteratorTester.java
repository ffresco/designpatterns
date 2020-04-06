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
public class IteratorTester {
    public static void testing(){
        System.out.println("------------Probando patron Iterator---------------------");
        EmpresaA empA = new EmpresaA();
        EmpresaB empB = new EmpresaB();
        IIterator iEmpA = empA.getConcreteIterator();
        IIterator iEmpB = empB.getConcreteIterator();
        
        imprimirColeccion(iEmpA);
        
        System.out.println("------------------------");
        
        imprimirColeccion(iEmpB);
        
        System.out.println("----------Probando current element-------------");
        System.out.println("Empresa b  " + (String)iEmpB.currentElement());
        System.out.println("Empresa a  " + (String)iEmpA.currentElement());
        System.out.println("------------Ahora voy al primero elelmento y veo el current------------");
        iEmpA.goFirst();
        iEmpB.goFirst();
        System.out.println("Empresa b  " + (String)iEmpB.currentElement());
        System.out.println("Empresa a  " + (String)iEmpA.currentElement());
        
        System.out.println("----Ahora voy a probar que mis iteradores trabajan sobre una copia----");
        System.out.println("colecciones originales " );
        System.out.println(empA.imprimirCol());
        System.out.println(empB.imprimirCol());
        System.out.println("Elimino los ultimos elementos de las colecciones originalees");
        empB.getEmpleados().remove(1);
        empA.getEmpleados()[1]="";
        System.out.println("--Originales----");
        System.out.println(empA.imprimirCol());
        System.out.println(empB.imprimirCol());
        System.out.println("--Copiar desde iterador---");
        imprimirColeccion(iEmpA);
        imprimirColeccion(iEmpB);
    }

    private static void imprimirColeccion(IIterator iEmpA) {
        while(iEmpA.hasNext()){
            String element = (String) iEmpA.next();
            System.out.println("Recorriendo Empresa " + element );
        }
    }
    
    
    
}
