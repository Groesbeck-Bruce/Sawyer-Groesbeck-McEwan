/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import escapefromchateaudelamisereriesawyergroesbeckmcewan.Escape;
import model.*;

/**
 *
 * @author tim
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Escape.setName(name);
        return player;
    }

    private static class startNewGame {

        public startNewGame() {
        }
    }

    private static class intializeMap {

        public intializeMap() {
        }
    }

    private static class saveGame {

        public saveGame() {

        }

        private static class retrieveGame {

            public retrieveGame() {

            }

            private static class createNewPlayer {

                public createNewPlayer() {
                }
            }
        }
    }
}
