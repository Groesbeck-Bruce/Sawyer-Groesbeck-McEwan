/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author aaronsawyer
 */
public class ItemControl {

    public boolean requiredKeys(int itemInventory[], int location) {
        if (itemInventory[location - 1] != 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
