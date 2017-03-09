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
public class LogicView extends View {

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

        public LiquidChallenge() {
        }

        public class ArmoryLockChallenge implements Serializable {

            private String playProblem;
            private double length;
            private double width;
            private double height;
            private double total;
        }

        public class AreaStoneChallenge implements Serializable {

            private String playProblem;
            private double length;
            private double width;
            private double height;
            private double total;
        }
    }
}
