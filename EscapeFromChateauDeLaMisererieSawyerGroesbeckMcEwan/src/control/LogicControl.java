/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author bruce
 */
public class LogicControl {

    public double stoneAreaChallenge(int height, int width, int length) {
        double[] stoneAreaChallenge = null;
        return stoneAreaChallenge[height + width + length];

    }

    public double liquidChallenge(int height, int width, int length) {
        int[] liquidChallenge = null;
        return liquidChallenge[height + width + length];

    }

    public double armoryLockChallenge(double sideA, double sideB, double sideC) {
        double result = sideA + sideB + sideC;
        return result;
    }

}
