/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter.interpreter2;

import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author fafre
 */
public class Interpretador {
    private String ecuacion;

    public Interpretador(String ecuacion) {
        this.ecuacion = ecuacion;
    }
    
    public String infixToPostFix(){
        Stack<String> pilaOp = new Stack<>();
        String strPost = "";
        String entrada = ecuacion.trim();
        
        for (int i = 0; i < entrada.length(); i++) {
            String currChar = entrada.substring(i, i + 1);
            if (!isOperador(currChar)) {
                strPost+= currChar;                
            } else {
                while ((!pilaOp.empty()) && (precede(pilaOp.lastElement(),currChar))) {
                    String topSym = pilaOp.pop();
                    strPost+=topSym;
                }
                pilaOp.push(currChar);
            }
        }
            while (!pilaOp.empty()) {
                String topSym = pilaOp.pop();
                strPost+=topSym;
            }
            return strPost;      
        
   
    }
    
    public int getTotal(){
        IExpresion nodoRaiz;
        nodoRaiz = buildTree(infixToPostFix());
        return nodoRaiz.evaluate();
    }

    private boolean isOperador(String currChar) {
        String[] matches = new String[]{"+","*"};
        for (int i = 0; i < matches.length; i++) {
            String matche = matches[i];
            if(currChar.contains(matche)) return true;
        }
        return false;
        
    }

    private boolean precede(String lastElement, String currChar) {
        //aca digo algo tiene mas precedencia si se ejecuta antes que otro operador, 
        //* precede a +
        //+ precede a ()
        if ("*".equals(lastElement)) {
            return true;
        }
        return false;
    }

    private IExpresion buildTree(String infixToPostFix) {
        Stack<IExpresion> pila = new Stack<IExpresion>();
        for (int i = 0; i < infixToPostFix.length(); i++) {
            String currChar = infixToPostFix.substring(i, i + 1);
            if (!isOperador(currChar)) {
                IExpresion terminal = new TerminalExp(Integer.valueOf(currChar).intValue());
                pila.push(terminal);
            } else {
                IExpresion der = (IExpresion) pila.pop();
                IExpresion izq = (IExpresion) pila.pop();
                IExpresion nonTerminal = getNonTerminalNoto(currChar,izq,der);
                pila.push(nonTerminal);
            }
        }
        return (IExpresion) pila.pop();
    }

    private IExpresion getNonTerminalNoto(String currChar, IExpresion izq, IExpresion der) {
        if ("*".equals(currChar)) {
            return new ProdExp(der, izq);
        }
        return new AddExp(der, izq);
    }
}
