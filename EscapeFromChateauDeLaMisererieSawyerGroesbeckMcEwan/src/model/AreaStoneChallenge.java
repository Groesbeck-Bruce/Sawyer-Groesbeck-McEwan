/*
 * To change this license header, choose License Headers in Project Properties.Serializable;
import java.util.Objects;

/**
 *
 * @author Tim McEwan
 */


package model;

import java.io.Serializable;
import java.util.Objects;
public class AreaStoneChallenge implements Serializable {
    private String playProblem;
    private double length;
    private double width;
    private double height;
    private double total;

    public AreaStoneChallenge() {
    }

    public String getPlayProblem() {
        return playProblem;
    }

    public void setPlayProblem(String playProblem) {
        this.playProblem = playProblem;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.playProblem);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "AreaStoneChallenge{" + "playProblem=" + playProblem + ", length=" + length + ", width=" + width + ", height=" + height + ", total=" + total + '}';
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
        final AreaStoneChallenge other = (AreaStoneChallenge) obj;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
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

