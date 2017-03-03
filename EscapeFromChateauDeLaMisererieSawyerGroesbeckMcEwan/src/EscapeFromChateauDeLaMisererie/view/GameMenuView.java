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

    static GameMenuView gameMenu;
    private final String menu;

    public GameMenuView() {
        this.menu = "\n"
                + "\n------------------------------"
                + "\n | Main Menu                 |"
                + "\n------------------------------"
                + "\nN - Start Game"
                + "\nG - Get and start saved game"
                + "\nH - Get help you noob"
                + "\nS - Save Game"
                + "\nQ - Quit Game"
                + "\n------------------------------";

    }

    void displayGameMenueView() {

        System.out.println("\n" + this.menu);
        String input = this.getInput();

        doAction(input);

    }
}
   /* private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";

        value = keyboard.nextLine();
        value = value.trim();

        return value;
    }

    private boolean doAction(String input) {

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

    private void startExistingGame() {
        System.out.println("*** Start Existing Game ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** Display Help Menu ***");
    }

    private void saveGame() {
        System.out.println("*** Save Game***");
    }

    static class gameMenu {

        public gameMenu() {
        }
    }
}
*/