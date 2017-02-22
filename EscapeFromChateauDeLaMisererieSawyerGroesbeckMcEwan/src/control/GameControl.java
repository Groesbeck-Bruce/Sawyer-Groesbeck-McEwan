
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

