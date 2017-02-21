package EscapeFromChateauDeLaMisererie.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package EscapeFromChateauDeLaMisererie.view;

/**
 *
 * @author bruce
 */
public class HelpMenuView {

   
    private boolean doAction(String choice) {

        choice = choice.toUpperCase();
        
        switch (choice) {        
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "Q": // quit game  
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }

        return false;
    }

    private void startNewGame() {
        System.out.println();
    }
    private void startExistingGame() {
        System.out.println();
    }

    private void saveGame() {
        System.out.println();
    }

    private void displayHelpMenu() {
         System.out.println();
    }

    private void quitGame() {
        System.out.println();
    }
}
