/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fafre
 */
public class Product {
    private List<String> partes;

    public Product() {
        partes = new LinkedList<>();
    }
    
    public void add(String part){
        partes.add(part);
    }
    public void show(){
        for (Iterator<String> iterator = partes.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
