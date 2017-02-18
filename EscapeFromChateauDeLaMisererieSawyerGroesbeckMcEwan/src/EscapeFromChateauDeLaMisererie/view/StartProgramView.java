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
        this.promptMessage = "\nPlease enter your name";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("Hello world this is our description of the game");
    }

    public void displayStartProgramView() {

        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
        
        } while (!done);
            
    }

    private String getPlayersName() {
        System.out.println("\n*** getPlayerName() called **");
        return "joe cool";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called **");
        return true;
    }
}
