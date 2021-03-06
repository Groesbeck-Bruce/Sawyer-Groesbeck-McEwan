/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EscapeFromChateauDeLaMisererie.view;

import java.io.Serializable;

/**
 *
 * @author Tim McEwan
 */
public class AreaChallengeView extends View {

    private String promptMessage;

    public AreaChallengeView() {

        this.promptMessage = "\n** Enter length, width and height";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("\n ** Welcome to the AreaStoneChallenge");
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }

    public class AreaStoneChallenge implements Serializable {

        private String playProblem;
        private double length;
        private double width;
        private double height;
        private double total;

        public AreaStoneChallenge() {
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
