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
 * @author: Tim McEwan
 */
public class Map implements Serializable {

    private int rowCount;
    private int columnCount;
    private Location[][] location;

    public Map() {
    }

    public void init() {
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
        
        location[0][0] = loc;
    }
    
    public Location getLocationAt(int row, int col) {
        return location[row][col];
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

}
