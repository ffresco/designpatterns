/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author fafre
 * 
 * 
 */
public class CalculatorAdapter {
    
    public static int total(Peso peso){
        int equivalenteDolar = peso.getCantidad()/16;
        Dolar dolar1 = new Dolar(equivalenteDolar);
        return dolar1.total();
    }
}
