/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

/**
 *
 * @author Bruce Groesbeck and Tim McEwan
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    
}
    public View(String message) {
        this.displayMessage = message;
    }
}

