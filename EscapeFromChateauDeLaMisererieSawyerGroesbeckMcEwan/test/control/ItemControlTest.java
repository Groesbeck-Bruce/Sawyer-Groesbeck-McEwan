/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruce Groesbeck, Tim McEwan
 */
public class ItemControlTest {
    
    public ItemControlTest() {
    }

    /**
     * Test of requiredKeys method, of class ItemControl.
     */
    @Test
    public void testRequiredKeys() {
        System.out.println("requiredKeys");
        int[] itemInventory = {1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0};
        int location = 12;
        ItemControl instance = new ItemControl();
        boolean expResult = false;
        boolean result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
