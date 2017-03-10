package control;

import escapefromchateaudelamisereriesawyergroesbeckmcewan.Escape;
import model.*;

/**
 *
 * @author tim
 */
public class GameControl {

    public static void createNewGame(Player player) {

        Game game = new Game(); //create new game
        Escape.setCurrentGame(game); //save in escape

        game.setPlayer(player);

        Item[] inventoryList = createList();

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.movePlayersToStartingLocation(map, player);
    }

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        Escape.setName(name);
        return player;
    }

    private static Item[] createList() {

        return new Item[0];
    }

    private static class startNewGame {

        public startNewGame() {
        }
    }

    private static class createNewGame {

        public createNewGame() {
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
