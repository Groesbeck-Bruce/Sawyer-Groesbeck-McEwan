/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import escapefromchateaudelamisereriesawyergroesbeckmcewan.Escape;
import exception.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Location;
import model.Map;
import model.Player;

/**
 *
 * @author bruce
 */
public class MapControl extends Exception {

    private static String coordinates;

    public static Map createMap() {
        
        //TODO implement this function
        Map map = new Map();
        
        map.init();

        return map;
    }

    public void init() {
        int rowCount = 5;
        int columnCount = 5;
        location Location = new location();
        Location location = new Location();
    }

    public static int movePlayersToStartingLocation(Map map, Player player) {
        player.setLocation(map.getLocation(0, 0));
        return 5; 
    }
       /* Map map = Escape.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
            newColumn < 0 || newColumn >= map.getColumnCount()) {
            try {
                throw new MapControlException("Can not move player to location"
                        +coordinates.x + "," + coordinates.y
            } catch (MapControlException ex) {
                Logger.getLogger(MapControl.class.getName()).log(Level.SEVERE, null, ex);
            }

                                            +"because that location is outside"
                                            +"the bounds of the map");
           
        return 0;    
        }

        //TODO more if you want

    private static  coordinates {

        private static int x;
        private static int y;

        public MapControl() {
        }*/
    }
    

