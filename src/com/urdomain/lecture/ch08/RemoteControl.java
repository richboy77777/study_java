package com.urdomain.lecture.ch08;

public interface RemoteControl {

	public String name = "Tony";
	
	//상수
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 : 구현 클래스에서 무조건 오버라이드 해야 된다.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드 : public  생략 가능
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드 : public 생략 가능
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
