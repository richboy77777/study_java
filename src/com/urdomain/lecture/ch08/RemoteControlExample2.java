package com.urdomain.lecture.ch08;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			
//			익명 구현객체
			@Override
			public void turnOn() {
				System.out.println("tontomtontom");

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}

		};

		rc.turnOn();
	}

}
