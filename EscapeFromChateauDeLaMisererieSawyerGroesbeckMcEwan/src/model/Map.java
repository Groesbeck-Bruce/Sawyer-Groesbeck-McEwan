/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author: Bruce
 */
public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location[][] location;

    public Map() {
    }
    
    public Map(int rowCount, int columnCount) {
        
        if (rowCount < 1 || columnCount < 1) {
        System.out.println("The number of rows and columns must be > zero");
        return;
        }
        
    this.rowCount = rowCount;
    this.columnCount = columnCount;
    
    //create 2-D array for location objects
    this.location = new Location[rowCount][columnCount];
    
    for (int row = 0; row < rowCount; row++) {
        for(int column = 0; column <columnCount; column++) {
    }    
        rowCount = 5;
        columnCount = 5;
        
        location = new Location[rowCount][columnCount];
        //TODO iterate over rows and columns and create locations in a loop (or two)
        
        //Build out a location
        Location loc = new Location();
        loc.setRow(0);
        loc.setColumn(0);
        loc.setVisited(false);
        loc.setWinGame(false);
        
        location[rowCount][columnCount] = loc;
    }
    }

    /**
     *
     * @param row
     * @param column
     * @return
     */
    public Location getLocation(int row, int column) {
        return location[row][column];
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.rowCount;
        hash = 19 * hash + this.columnCount;
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    public void init() {
            System.out.println();
    }

}
