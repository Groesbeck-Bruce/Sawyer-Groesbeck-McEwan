/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.util.Scanner;

/**
 *
 * @author Tim McEwan
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n***"
                + "\n------------------------------"
                + "\n | Main Menu                 |"
                + "\n------------------------------"
                + "\nN - Start Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help you noob"
                + "\nS - Save Game"
                + "\nQ - Quit Game"
                + "\n------------------------------");

    }
}

//@Override
//public boolean doAction(String value) {
//    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   }
//}
/*
    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    /*void displayMainMenueView() {

        System.out.println("\n" + this.menu);
        String input = this.getInput();

        doAction(input);

    }
 */
 /*private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";

        value = keyboard.nextLine();
        value = value.trim();

        return value;
    }

    @Override
    private boolean doAction(String value) {
        

        value = value.toUpperCase();

        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Key *** Try again");
        }
        return false;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called **");
    }

    private void displayHelpMenu() {
        HelpView helpMenuView = new HelpView();

        helpMenuView.displayHelpMenueView();
    }
}
 */
