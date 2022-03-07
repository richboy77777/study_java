package com.urdomain.lecture.ch07;

public class Computer extends Calculator {

	//Override 통째로 주석 잡아보면 부모부분이 출력됨
	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}

}
