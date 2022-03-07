package com.urdomain.lecture.ch06;

public class Person {

	final String nation = "korea";		//1번 초기화 방법
	final String ssn;
	String name;
	
	public Person(String ssn, String name)	{		//2번 초기화 방법
		this.ssn = ssn;
		this.name = name;
	}
}
