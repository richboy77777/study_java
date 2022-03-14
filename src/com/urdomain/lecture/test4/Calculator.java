package com.urdomain.lecture.test4;

public class Calculator {

	public double Circle(double r) {

		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");

		return Constants.PAI_1 * r * r;		//Constants 함수 사용방법임 직접 숫자대입 하면 안됨
	}

}
