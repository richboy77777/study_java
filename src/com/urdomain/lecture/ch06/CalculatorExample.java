package com.urdomain.lecture.ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int result1 = calculator.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("result2: " + result2);

		
//		ctrl 누른 상태에서 powerOff위에 커서 올리고 클릭하기
		
		calculator.powerOff();	//Calculator.java powerOff랑 연동됨
		
		powerOff();	//밑에 static void 연동됨
	}

	public static void powerOff()	{
		System.out.println("전원을 끕니다.");
	}
}
