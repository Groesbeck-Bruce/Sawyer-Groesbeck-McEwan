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

        //Create items for the game
        Item[] items = ItemControl.createItemList();

        //Create the map for the game
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
}
