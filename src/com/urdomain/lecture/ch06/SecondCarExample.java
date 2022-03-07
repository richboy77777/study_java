package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {

		SecondCar secondcar = new SecondCar();
		
		secondcar.model = "그랜져";
		
		System.out.println("company: " + secondcar.company);
		System.out.println("model: " + secondcar.model);
		System.out.println("color: " + secondcar.color);
		System.out.println("maxSpeed: " + secondcar.maxSpeed);
		System.out.println("-------------------------");
		
		SecondCar secondcar2 = new SecondCar("싼타페");

		System.out.println("company: " + secondcar2.company);
		System.out.println("model: " + secondcar2.model);
		System.out.println("color: " + secondcar2.color);
		System.out.println("maxSpeed: " + secondcar2.maxSpeed);
		System.out.println("-------------------------");

		SecondCar secondcar3 = new SecondCar("제네시스", "노랑색");

		System.out.println("company: " + secondcar3.company);
		System.out.println("model: " + secondcar3.model);
		System.out.println("color: " + secondcar3.color);
		System.out.println("maxSpeed: " + secondcar3.maxSpeed);
		System.out.println("-------------------------");
		
		
		SecondCar secondcar4 = new SecondCar("포니", "파랑색", 300);

		System.out.println("company: " + secondcar4.company);
		System.out.println("model: " + secondcar4.model);
		System.out.println("color: " + secondcar4.color);
		System.out.println("maxSpeed: " + secondcar4.maxSpeed);

	}

}
