/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author fafre
 */
public class SQLConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("Estoy haciendo una conneccion SQL ....");
    }
}
