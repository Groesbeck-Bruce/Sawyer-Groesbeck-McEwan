/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

/**
 *
 * @author sudo
 */
public class StartProgramView {
    private String promptMessage; 
    
    
    public StartProgramView() {
    this.promptMessage = "\nPlease enter your name: "; 
    this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "Description welcome welcome");
    }




}
