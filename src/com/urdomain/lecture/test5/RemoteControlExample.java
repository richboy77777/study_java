package com.urdomain.lecture.test5;

public class RemoteControlExample {

	public static void main(String[] args) {

		Television television = new Television();

		television.turnOn();
		television.setMute(true);
		television.setMute(false);
		television.setVolume(-10);
		RemoteControl.changeBattery();
		television.turnOff();
	}

}
