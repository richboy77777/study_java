package com.urdomain.lecture.test4;

public class Computer extends Calculator {

	@Override
	public double Circle(double r) {

		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");

		return Constants.PAI_2 * r * r;		//Constants 함수 사용방법임 직접 숫자대입 하면 안됨
	}

}
