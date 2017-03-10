/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Map;
import model.Player;

/**
 *
 * @author bruce
 */
public class MapControl {

    public static Map createMap() {
        //TODO implement this function
        Map map = new Map();

        map.init();
        
        return map;
    }

    public static void movePlayersToStartingLocation(Map map, Player player) {
        player.setLocation(map.getLocationAt(0, 0));
        
        //TODO more if you want
    }
}
