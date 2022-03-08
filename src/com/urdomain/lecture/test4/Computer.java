package com.urdomain.lecture.test4;

public class Computer extends Calculator {

	@Override
	public double Circle(double r) {

		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");

		return 3.14159265358979323846 * r * r;
	}

}
