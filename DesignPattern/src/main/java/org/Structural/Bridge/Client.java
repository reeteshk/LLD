package org.Structural.Bridge;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        AdvancedRemoteControl remoteControl = new AdvancedRemoteControl(tv);
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.mute();
        remoteControl.turnOff();

        BasicRemoteControl remoteControl1 = new BasicRemoteControl(radio);
        remoteControl1.turnOn();
        remoteControl1.setVolume(10);
        remoteControl1.turnOff();
    }
}
