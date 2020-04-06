/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fafre
 */
public class Interpreter {
    
    public int calcular(String calculo){
        //parseamos el String para crear expresiones mas
        System.out.println("Recibi esta ecuacion : " +calculo);
        IExpresion raiz = new OperacionSuma();
        String[] expresiones;
        expresiones = calculo.split("[+]");
        for (int i = 0; i < expresiones.length; i++) {
            String expresione = expresiones[i];
            raiz.addExpresion(this.getExpresion(expresione));
        }
        return raiz.resolve();
    }

    private IExpresion getExpresion(String exp) {
        String[] expresiones = exp.split("[*]");
        IExpresion multiplica = new OperacionMultiplica();
        for (int i = 0; i < expresiones.length; i++) {
            String expresione = expresiones[i];
            System.out.println("Creo la nueva expresion " + expresione );
            multiplica.addExpresion(new NumeroExp(Integer.parseInt(expresione)));
        }
        return multiplica;
    }
    
}
