/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.util.Scanner;

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

    @Override
    public void display() {

        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;

        while (!valid) {
            System.out.println("\n*** " + this.displayMessage);

            value = keyboard.nextLine();
            value = value.trim();

            /* if (value.length() < 1) {
                    System.out.println("\n*** You must enter a value");
                    continue;
                }
                break;
                // 
            //    }
             */
            return value;
        }
        return (null);

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
