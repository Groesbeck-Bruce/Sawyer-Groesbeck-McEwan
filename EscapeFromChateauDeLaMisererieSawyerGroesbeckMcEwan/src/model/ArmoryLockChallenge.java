package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aaronsawyer
 */
public class ArmoryLockChallenge implements Serializable {
    private String playProblem;
    private double sideA;
    private double sideB;
    private double sideC;
    private double total;

    public ArmoryLockChallenge() {
    }

    public String getPlayProblem() {
        return playProblem;
    }

    public void setPlayProblem(String playProblem) {
        this.playProblem = playProblem;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.playProblem);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.sideA) ^ (Double.doubleToLongBits(this.sideA) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.sideB) ^ (Double.doubleToLongBits(this.sideB) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.sideC) ^ (Double.doubleToLongBits(this.sideC) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ArmoryLockChallenge{" + "playProblem=" + playProblem + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + ", total=" + total + '}';
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
        final ArmoryLockChallenge other = (ArmoryLockChallenge) obj;
        if (Double.doubleToLongBits(this.sideA) != Double.doubleToLongBits(other.sideA)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sideB) != Double.doubleToLongBits(other.sideB)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sideC) != Double.doubleToLongBits(other.sideC)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (!Objects.equals(this.playProblem, other.playProblem)) {
            return false;
        }
        return true;
    }

}