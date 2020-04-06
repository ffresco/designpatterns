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
public interface IFactory {

    /**
     *
     * @param type
     * @return
     */
    public IConnection getInstance(String type) throws Exception;
    public static final String SQL = "SQL";
    public static final String ORACLE = "ORACLE";
}