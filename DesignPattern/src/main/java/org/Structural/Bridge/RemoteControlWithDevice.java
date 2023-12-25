package org.Structural.Bridge;

public class RemoteControlWithDevice implements RemoteControl{
    private Device device;

    public RemoteControlWithDevice(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolume(int volume) {
        device.setVolume(volume);
    }

    public void mute() {
        device.setVolume(0);
    }
}
