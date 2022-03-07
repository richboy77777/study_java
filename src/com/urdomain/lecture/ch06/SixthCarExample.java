package com.urdomain.lecture.ch06;

public class SixthCarExample {

	static String name = "이상원";
	
	public static void main(String[] args) {
		
		name = "전지현";	//static을 동일하게 선언해주어야 사용 가능함
		
		SixthCar myCar = new SixthCar("포르쉐");
		SixthCar yourCar = new SixthCar("벤츠");

		myCar.run();
		yourCar.run();
		
		print("asdf");
	}
	
	public static void print(String msg)	{
		System.out.println(msg);
	}

}
