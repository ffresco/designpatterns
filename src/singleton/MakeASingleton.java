/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author fafre
 * Esta clase es singleton de si misma es decir te da una instancia unica de si misma
 */
public class MakeASingleton {
    private static MakeASingleton instancia;
    private String nombre;

    private MakeASingleton() {
    }
    
    public static MakeASingleton getInstance(){
        if (instancia==null) {
            instancia = new MakeASingleton();
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
