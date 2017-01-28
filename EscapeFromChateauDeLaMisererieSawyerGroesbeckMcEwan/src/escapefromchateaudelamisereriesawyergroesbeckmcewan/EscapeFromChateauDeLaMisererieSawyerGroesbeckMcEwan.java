/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escapefromchateaudelamisereriesawyergroesbeckmcewan;
// Hello this is tim McEwan
//I think you guys are pretty cool

import model.Player;
import model.ArmoryLockChallenge;

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
        
        // ArmoryLockChallenge
        ArmoryLockChallenge firstLock = new ArmoryLockChallenge();

        firstLock.setPlayProblem("Armory Lock Challenge Question");
        firstLock.setSideA(4.1);
        firstLock.setSideB(4.2);
        firstLock.setSideC(4.3);
        firstLock.setTotal(12.6);

        String lockInfo = firstLock.toString();
        System.out.println(lockInfo);
        
    }
    
}
