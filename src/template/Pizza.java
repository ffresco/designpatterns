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
public abstract class Pizza {

    public Pizza() {
    }
    public void paso1(){
        System.out.println("Se prepara la pizza base que es masa con tomate");
    }
    public void paso2(){
        System.out.println("se le pega un golpe de horno");
    }
    
    /*
    La gracia aca es que al oblicar a las subclases a implementar el metodo especial, que en esta clase
    no se implementa, lo que sucede es que paso 1 y paso 2 todos lo implementan pero el paso especial es
    responsabilidad de cada clase
    */
    public void preparacionBase(){
        this.paso1();
        this.paso2();
        this.preparacionEspecial();
    }
    
    public abstract void preparacionEspecial();
}
