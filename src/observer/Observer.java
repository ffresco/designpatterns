/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author fafre
 */
public class Observer {
    private String nombre;
    /**
     * Este metodo informa los cambios observados en el sujeto
     */   
    public void update(){
        System.out.println(nombre +"--El flag ha cambiado en el sujeto");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
