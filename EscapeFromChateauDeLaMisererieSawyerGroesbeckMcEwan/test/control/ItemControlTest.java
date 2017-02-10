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
        //Test #1        
        System.out.println("Test #1");
        int[] itemInventory = {1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0};
        int location = 4;
        ItemControl instance = new ItemControl();
        boolean expResult = true;
        boolean result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        
        //Test #2
        System.out.println("Test #2");
        location = 12;
        expResult = false;
        result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        
        //Test #3
        System.out.println("Test #3");
        location = 1;
        expResult = true;
        result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        
        //Test #4
        System.out.println("Test #4");
        location = 10;
        expResult = false;
        result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
    }
    
}
