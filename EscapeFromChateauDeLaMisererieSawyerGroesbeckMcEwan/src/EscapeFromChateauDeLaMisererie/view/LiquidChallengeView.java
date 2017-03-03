/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

/**
 *
 * @author bruce
 */
public class LiquidChallengeView extends View {
    
    private String promptMessage;
    
    public LiquidChallengeView() {
        
        this.promptMessage = "\n** Enter length, width and height";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n ** Welcome to the Liquid Challenge");
    }
}
