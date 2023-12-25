package org.Structural.Bridge;

public class DVDPlayer implements Device{
    private boolean on;
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("DVD Player is ON");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("DVD Player is OFF");
        on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("DVD Player Volume is set to " + volume);
    }
}
