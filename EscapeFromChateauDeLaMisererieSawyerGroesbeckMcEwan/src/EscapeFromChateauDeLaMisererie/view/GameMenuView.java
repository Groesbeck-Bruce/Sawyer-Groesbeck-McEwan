/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.util.Scanner;

/**
 *
 * @author Bruce Groesbeck
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------"
                + "\n | Game Menu                 |"
                + "\n------------------------------"
                + "\nN - action"
                + "\nG - Get and start saved game"
                + "\nH - Get help you noob"
                + "\nS - Save Game"
                + "\nQ - Quit Game"
                + "\n------------------------------");
        //TODO add option to view map
        //TODO add options to move around map

    }

    @Override
    public boolean doAction(String input) {

        input = input.toUpperCase();

        switch (input) {
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
        System.out.println("*** Start a New Game ***");
    }
    private void createNewGame() {
        System.out.println("*** New Game ***");
    }
    private void startExistingGame() {
        System.out.println("*** Start Existing Game ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** Display Help Menu ***");
    }

    private void saveGame() {
        System.out.println("*** Save Game***");
    }
    
    private void viewMap() {
        //TODO iterate over map and output locations
    }
    
    private void moveNorth() {
        //TODO update the player's location with "current location row - 1"
    }
    
    //TODO other directions

}