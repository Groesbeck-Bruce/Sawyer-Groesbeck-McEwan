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
public class MainMenuView {
  private String menu;
  
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
    void displayMainMenueView() {
      
        boolean done = false;
        do {
               String menuOption = this.getMenuOption();
               if (menuOption.toUpperCase().equals("Q"))
                   return;
               
               done = this.doAction(menuOption);
        } while (!done);
    }
    private String getMenuOption() {
        System.out.println("\n**** getMenuOption() fired");
        return "N";
    }
    private boolean doAction(String menuOption) {
           System.out.println("\n*** doAction() fired ***");
           return true;
    }


    

}
