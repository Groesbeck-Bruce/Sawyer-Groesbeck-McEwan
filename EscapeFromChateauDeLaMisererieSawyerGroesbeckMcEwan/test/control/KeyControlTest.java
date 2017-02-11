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
 * @author tim
 */
public class KeyControlTest {

    public KeyControlTest() {

    }

    /**
     * Test of requiredKeys method, of class KeyControl.
     */
    @Test
    public void testRequiredKeys() {

        //Test 1
        System.out.println("Test 1");
        int[] itemInventory = {1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0};
        int location = 4;
        KeyControl instance = new KeyControl();
        boolean expResult = true;
        boolean result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        //Test 2
        System.out.println("Test 2");
        location = 4;
        //KeyControl instance = new KeyControl();
        expResult = false;
        result = instance.requiredKeys(itemInventory, location);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //Test 3
        System.out.println("Test 3");
        location = 7;
        //KeyControl instance = new KeyControl();
        expResult = false;
        result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        //Test 4
        System.out.println("Test 4");
        location = 5;
        //KeyControl instance = new KeyControl();
        expResult = false;
        result = instance.requiredKeys(itemInventory, location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
