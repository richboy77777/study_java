package com.urdomain.lecture.ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();		//추상클래스는 객체생성이 불가하다.
		
		SmartPhone smartPhone = new SmartPhone("gentle");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
	}

}
