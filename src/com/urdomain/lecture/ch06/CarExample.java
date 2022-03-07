package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();	//생성자 = 함수이다., new : 연산자
		
		Student student = new Student();
		
//		Student student = new Student();
		
		System.out.println("student.no: " +  student.no);
		
		
		
		

//		객체접근연산자(.) 를 사용하여 객채 변수의 값을 참조

		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed); // 0

		car.speed = 100;

		System.out.println("speed: " + car.speed); // 100
		
		if (car.speed > car.maxSpeed) {
			System.out.println("speed가 maxSpeed보다 빠릅니다");
		} else {
			System.out.println("speed가 maxSpeed보다 느립니다");
		}

		
	}

//		speed가 maxSpeed보다 속도가 높은지 낮은지 출력하는 함수 만들기

	public void needforspeed(int speed, int maxSpeed) {


	}

}
