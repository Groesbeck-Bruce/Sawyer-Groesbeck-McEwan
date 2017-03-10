/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.io.Serializable;

/**
 *
 * @author bruce
 */
public class LiquidChallengeView extends View {

    static void LiquidChallenge() {
        System.out.println();
    }

    private String promptMessage;

    public LiquidChallengeView() {

        this.promptMessage = "\n** Enter length, width and height";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n ** Welcome to the Liquid Challenge"
                          + "+\n ** Enter the correct formula to "
                          + "pass the challenge to get a key to  "
                          + "open the door as you try to escape  "
                          + "the prison. Remember to watch our for"
                          + "warden as well as the guards");
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }

    public class LiquidChallenge implements Serializable {

        private String playProblem;
        private double length;
        private double width;
        private double height;
        private double total;
    }
}

        