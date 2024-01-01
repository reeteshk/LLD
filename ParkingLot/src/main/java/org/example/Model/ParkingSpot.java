package org.example.Model;

public abstract class ParkingSpot {
    private int id;
    private boolean isFree;
    private Vehicle vehicle;

    public boolean getIsFree() {
        return isFree;
    }
}
