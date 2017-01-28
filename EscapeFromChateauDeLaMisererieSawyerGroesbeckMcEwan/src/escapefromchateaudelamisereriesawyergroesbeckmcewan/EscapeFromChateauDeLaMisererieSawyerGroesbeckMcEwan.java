/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefromchateaudelamisereriesawyergroesbeckmcewan;
// Hello this is tim McEwan
//I think you guys are pretty cool

import model.Player;
import model.Logic;
import model.ArmoryLockChallenge;
import model.LiquidChallenge;
import model.Location;
import model.Item;

// This is Aaron
// Hello everyone 
//Hello from Bruce
/**
 *
 * @author aaronsawyer
 */
public class EscapeFromChateauDeLaMisererieSawyerGroesbeckMcEwan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Bruce");
        playerOne.setBestTime(5.32);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // Logic Aaron Sawyer
        Logic firstLogic = new Logic();
        
        
        // ArmoryLockChallenge Aaron Sawyer
        ArmoryLockChallenge firstLock = new ArmoryLockChallenge();

        firstLock.setPlayProblem("Armory Lock Challenge Question");
        firstLock.setSideA(4.1);
        firstLock.setSideB(4.2);
        firstLock.setSideC(4.3);
        firstLock.setTotal(12.6);
        
        String lockInfo = firstLock.toString();
        System.out.println(lockInfo);
      
        // LiquidChallenge Bruce Groesbeck
        LiquidChallenge firstLiquid = new LiquidChallenge();
        
        firstLiquid.setPlayProblem("Liquic Challenge Question");
        
        firstLiquid.setLength(5.2);
        firstLiquid.setWidth(5.3);
        firstLiquid.setHeight(5.5);
        firstLiquid.setTotal(16.0);
        
        String liquidInfo = firstLiquid.toString();
        System.out.println(liquidInfo);
        
        //Location Bruce Groesbeck
        Location firstLocation = new Location();
        firstLocation.setRow(2);
        firstLocation.setColumn(7);
        firstLocation.setVisited(true);
        firstLocation.setWinGame(false);
             
               
        String locationInfo = firstLocation.toString();
        System.out.println(locationInfo);
        
        // Item Bruce Groesbeck
        Item firstItem = new Item();
        firstItem.setInventoryType("hammer");
        firstItem.setQuantityInStock(4);
        firstItem.setRequiredAmount(8);
        
        String itemInfo = firstItem.toString();
        System.out.println(itemInfo);
    }
    
}
