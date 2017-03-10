/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Item;
/**
 *
 * @author aaronsawyer
 */
public class ItemControl {

    public static Item[] createItemList() {

        //created arrayList of inventory items
        Item[] inventory
                = new Item[3];

        Item lantern = new Item();
        lantern.setDescription("Lantern");
        lantern.setQuantityInStock(0);
        lantern.setRequiredAmount(0);
        inventory[0] = lantern;

        Item key = new Item();
        key.setDescription("Key");
        key.setQuantityInStock(0);
        key.setRequiredAmount(0);
        inventory[1] = key;

        Item rope = new Item();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[2] = rope;
        return inventory;

    }

    // Take in itemInventory aray and location number
    public boolean requiredKeys(int itemInventory[], int location) {
        // See if index is not 0 (0 means no key for location)
        return itemInventory[location - 1] != 0;
    }
}
