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

    // Take in itemInventory aray and location number
    public boolean requiredKeys(int itemInventory[], int location) {
        // See if index is not 0 (0 means no key for location)
        return itemInventory[location - 1] != 0;
    }

}
