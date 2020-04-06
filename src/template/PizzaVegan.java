/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

/**
 *
 * @author fafre
 */
public class PizzaVegan  extends Pizza{

    public PizzaVegan() {
    }

    @Override
    public void preparacionEspecial() {
       
        System.out.println("Se le agrega las verduras para hacer pizza vegana");
    }
    
    
    
}
