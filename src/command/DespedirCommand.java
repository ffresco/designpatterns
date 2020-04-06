/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author fafre
 */
public class DespedirCommand implements ICommand {
    private IReceiver receiver;

    public DespedirCommand(IReceiver receiver) {
        this.receiver = receiver;
    }
    
    
    @Override
    public void ejecutar() {
        receiver.despedir();
    }
    
}
