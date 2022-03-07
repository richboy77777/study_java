package com.urdomain.lecture.ch06;

public class ThirdCar {

	//field
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	
	ThirdCar()	{
	}
	
	ThirdCar(String model)	{
		this(model, null, 0);
	}
	
	ThirdCar(String model, String color)	{
		this(model, color, 0);
	}
	
	ThirdCar(String model, String color, int maxSpeed)	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
//	ThirdCar()	{
//	}
//	
//	ThirdCar(String model)	{
//		this model = model;
//	}
//	
//	ThirdCar(String model, String color)	{
//		this model = model;
//		this color = color;
//	}
//	
//	ThirdCar(String model, String color, int maxSpeed)	{
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
//	
	
}
