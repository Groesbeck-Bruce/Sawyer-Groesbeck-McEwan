/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import control.GameControl;
import java.util.Scanner;
import model.Player;

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
        System.out.println("Hello and welcome to the Chateau De La Misererie. "
                + "You are a prisoner here and need to collect the keys needed"
                + "to escape from the chateau. There are many rooms that you can "
                + "move to as you plan you escape route. Remember to always watch"
                + "out for the warden and guards as you collect your keys");
   

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
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name:"
            + "The name must be greater than one character in length");
            return false;
        } 
        Player player = GameControl.createPlayer(playersName);
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
            return true; //Success
            
            
    }


    
    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                            + "\n Welcome to the game " + player.getName()
                            + "\n We hope you have a lot of fun!"
                            + "\n======================================="
     );
        
        MainMenuView mainMenuView = new MainMenuView();
                
        mainMenuView.displayMainMenueView();
    }
   
}

