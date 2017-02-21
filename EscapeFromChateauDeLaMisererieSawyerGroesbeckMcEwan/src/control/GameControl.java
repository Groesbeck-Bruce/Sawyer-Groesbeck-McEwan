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

    private static String name;

    public static Player createPlayer(String playersName) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        Escape.setName(name);
        return player;
        Escape.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }

    /**
     *
     * @param player
     */
    //public static void createNewGame(Player player) {
        //System.out.println();
    }

    class startNewGame {

        public startNewGame() {
        }
    }

    class intializeMap {

        public intializeMap() {
        }
    }

    class saveGame {

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
