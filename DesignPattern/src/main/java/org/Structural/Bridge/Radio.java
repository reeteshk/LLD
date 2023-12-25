package org.Structural.Bridge;

public class Radio implements Device{
    private boolean on;
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
        on = false;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio Volume is set to " + volume);
    }
}
