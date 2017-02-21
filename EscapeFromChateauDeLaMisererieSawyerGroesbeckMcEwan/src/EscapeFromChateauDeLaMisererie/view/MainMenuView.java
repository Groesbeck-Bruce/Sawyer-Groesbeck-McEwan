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
public class MainMenuView {
  private final String menu;
  
  public MainMenuView() {
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
    void displayMainMenuView() {
      
        System.out.println("\n" + this.menu);
        String input = this.getInput();
        
        doAction(input);
        
 
    }
    private String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
            System.out.println("\n" + this.menu);
            
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
    System.out.println("*** startNewGame function called ***");
}
private void startExistingGame() {
    System.out.println("*** startExistingGame function called ***");
}
private void saveGame() {
    System.out.println("*** startExistingGame function called **");
}
private void displayHelpMenu() {
    System.out.println("*** displayHelpMenue function called ***");
}


   

}
