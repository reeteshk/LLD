package org.Structural.Bridge;

public class TV implements Device {
    private boolean on;
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
        on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV Volume is set to " + volume);
    }
}
