/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import adapter.AdapterTester;
import bridge.BridgeTester;
import builder.BuilderTester;
import chainofrespon.ChainTester;
import command.CommandTester;
import composite.CompositeTester;
import decorator.DecoratorTester;
import facade.FacadeTester;
import factory.FactoryTester;
import flyweight.FlyWeightTester;
import flyweight.RobotFactory;
import interpreter.InterpreterTester;
import interpreter.interpreter2.Interpreter2Tester;
import iterator.IteratorTester;
import mediator.MediatorTester;
import memento.MementoTester;
import memento.undoredo.MementoStackTester;
import observer.ObserverTester;
import proxy.ProxyTester;
import singleton.SingletonTester;
import state.StateTester;
import template.TemplateTester;
import visitor.VisitorTester;

/**
 *
 * @author fafre
 */
public class PatronesDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vamos a ir probando un patron por dia");
        ObserverTester.testing();
        SingletonTester.testing();
        ProxyTester.testing();
        DecoratorTester.testing();
        TemplateTester.testing();
        AdapterTester.testing();
        CommandTester.testint();
        IteratorTester.testing();
        FacadeTester.testing();
        FactoryTester.testing();
        MementoTester.testing();
        MementoStackTester.testing();
        StateTester.testing();
        BuilderTester.testing();
        FlyWeightTester.testing();
        MediatorTester.testing();
        ChainTester.testing();
        CompositeTester.testing();  
        BridgeTester.testing();
        InterpreterTester.testing();
        Interpreter2Tester.testing();
        VisitorTester.testitn();
        
    }
    
}
