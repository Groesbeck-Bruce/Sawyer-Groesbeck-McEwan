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
 * @author bruce
 */
public class LogicControlTest {

    public LogicControlTest() {
    }

    /**
     * Test of stoneAreaChallenge method, of class LogicControl.
     */
    @Test
    public void testStoneAreaChallenge() {
        // Test 1
        System.out.println("stoneAreaChallenge Test 1");
        double height = 0.0;
        double width = 0.0;
        double length = 0.0;
        LogicControl instance = new LogicControl();
        double expResult = 0.0;
        //double result = instance.stoneAreaChallenge(height, width, length);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        // Test 2
        System.out.println("stoneAreaChallenge Test 2");
        height = 5.6;
        width = 4.3;
        length = 2.8;
        //LogicControl instance = new LogicControl();
        expResult = 17.6;
        //double result = instance.stoneAreaChallenge(height, width, length);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        // Test 3
        System.out.println("stoneAreaChallenge Test 3");
        height = 7.3;
        width = 4.9;
        length = 3.4;
        //LogicControl instance = new LogicControl();
        expResult = 4.3;
        //double result = instance.stoneAreaChallenge(height, width, length);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        // Test 4
        System.out.println("stoneAreaChallenge Test 4");
        height = 1.8;
        width = 2.9;
        length = 7.3;
        //LogicControl instance = new LogicControl();
        expResult = 15.6;
        //double result = instance.stoneAreaChallenge(height, width, length);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of liquidChallenge method, of class LogicControl.
     */
    @Test
    public void testLiquidChallenge() {
        System.out.println("liquidChallenge Test 1");
        int height = 0;
        int width = 0;
        int length = 0;
        LogicControl instance = new LogicControl();
        double expResult = 0.0;
        //double result = instance.liquidChallenge(height, width, length);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

        //Test 2
        System.out.println("liquidChallenge Test 2");
        height = 7;
        width = 6;
        length = 1;
        //LogicControl instance = new LogicControl();
        expResult = 41.6;

        //Test 3
        System.out.println("liquidChallenge Test 3");
        height = 8;
        width = 88;
        length = 58;
        //LogicControl instance = new LogicControl();
        expResult = 48.3;

        //Test 4
        System.out.println("liquidChallenge Test 4");
        height = 74;
        width = 21;
        length = 56;
        //LogicControl instance = new LogicControl();
        expResult = 128.6;
    }

    /**
     * Test of armoryLockChallenge method, of class LogicControl.
     */
    @Test
    public void testArmoryLockChallenge() {
        //Test 1
        System.out.println("Armory Lock Challenge Test 1");
        double sideA = 4.1;
        double sideB = 4.2;
        double sideC = 4.3;
        LogicControl instance = new LogicControl();
        double expResult = 12.6;
        //assertArrayEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.

        //Test 2
        System.out.println("Armory Lock Challenge Test 2");
        sideA = 15.3;
        sideB = 22.7;
        sideC = 29.4;
        //LogicControl instance = new LogicControl();
        expResult = 88.6;

        //Test 3
        System.out.println("Armory Lock Challenge Test 3");
        sideA = 7.9;
        sideB = 74.9;
        sideC = 145.3;
        //LogicControl instance = new LogicControl();
        expResult = 128.6;

        //Test 4
        System.out.println("Armory Lock Challenge Test 4");
        sideA = 76.4;
        sideB = 77.9;
        sideC = 23.9;
        //LogicControl instance = new LogicControl();
        expResult = 256.9;
    }

}
