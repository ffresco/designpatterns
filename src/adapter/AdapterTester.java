/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author fafre
 */
public class AdapterTester {
    public static void testing(){
        System.out.println("--------Probando el adapter------------");
        Dolar d1 = new Dolar(100);
        System.out.println("Creo un dolar de 100 y vemos su cantidad es " + String.valueOf(d1.getCantidad()) );
        Peso p1 = new Peso(160);
        System.out.println("Cree un peso de 160 y su cantidad es  " + String.valueOf(p1.getCantidad()));
        System.out.println("Calculador original pasando dolar " + String.valueOf(Calculator.total(d1)) );
        System.out.println("CalculadorAdapter le paso pesos me debe devolver dolares:  " + String.valueOf(CalculatorAdapter.total(p1)) );
    }
    
}
