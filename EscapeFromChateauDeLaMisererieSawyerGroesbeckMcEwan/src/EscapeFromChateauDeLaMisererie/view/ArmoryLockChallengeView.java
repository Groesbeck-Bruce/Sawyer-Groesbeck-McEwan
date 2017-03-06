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
public class ArmoryLockChallengeView extends View {
    
    static void ArmoryLockChallenge() {
        System.out.println();
    }

    private String promptMessage;

    public ArmoryLockChallengeView() {

        this.promptMessage = "\n** Enter Side A, Side B and Side C";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n ** Welcome to the Armory Lock Challenge");
    }

    public class ArmoryLockChallenge implements Serializable {

        private String playProblem;
        private double length;
        private double width;
        private double height;
        private double total;

        public ArmoryLockChallenge() {
        }

        public String getPlayProblem() {
            return playProblem;
        }

        public void setPlayProblem(String playProblem) {
            this.playProblem = playProblem;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

    }
}
