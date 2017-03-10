/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import control.GameControl;
import escapefromchateaudelamisereriesawyergroesbeckmcewan.Escape;
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

    @Override
    public boolean doAction(String value) {

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
        // create a new game
        GameControl.createNewGame(Escape.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** startExistingGame function called **");
    }

    private void displayHelpMenu() {
        HelpView helpMenuView = new HelpView();

        helpMenuView.display();
    }
}