package model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author aaronsawyer
 */
public class Logic implements Serializable {
    private AreaStoneChallenge areaStoneChallenge;
    private LiquidChallenge liquidChallenge;
    private ArmoryLockChallenge armoryLockChallenge;
    private String playProblem;

    public Logic() {
    }



    public AreaStoneChallenge getAreaStoneChallenge() {
        return areaStoneChallenge;
    }

    public void setAreaStoneChallenge(AreaStoneChallenge areaStoneChallenge) {
        this.areaStoneChallenge = areaStoneChallenge;
    }

    public LiquidChallenge getLiquidChallenge() {
        return liquidChallenge;
    }

    public void setLiquidChallenge(LiquidChallenge liquidChallenge) {
        this.liquidChallenge = liquidChallenge;
    }

    public ArmoryLockChallenge getArmoryLockChallenge() {
        return armoryLockChallenge;
    }

    public void setArmoryLockChallenge(ArmoryLockChallenge armoryLockChallenge) {
        this.armoryLockChallenge = armoryLockChallenge;
    }

    public String getPlayProblem() {
        return playProblem;
    }

    public void setPlayProblem(String playProblem) {
        this.playProblem = playProblem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.areaStoneChallenge);
        hash = 11 * hash + Objects.hashCode(this.liquidChallenge);
        hash = 11 * hash + Objects.hashCode(this.armoryLockChallenge);
        hash = 11 * hash + Objects.hashCode(this.playProblem);
        return hash;
    }

    @Override
    public String toString() {
        return "Logic{" + "areaStoneChallenge=" + areaStoneChallenge + ", liquidChallenge=" + liquidChallenge + ", armoryLockChallenge=" + armoryLockChallenge + ", playProblem=" + playProblem + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Logic other = (Logic) obj;
        if (!Objects.equals(this.playProblem, other.playProblem)) {
            return false;
        }
        if (!Objects.equals(this.areaStoneChallenge, other.areaStoneChallenge)) {
            return false;
        }
        if (!Objects.equals(this.liquidChallenge, other.liquidChallenge)) {
            return false;
        }
        if (!Objects.equals(this.armoryLockChallenge, other.armoryLockChallenge)) {
            return false;
        }
        return true;
    }



}
