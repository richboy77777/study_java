package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567", "전지현");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);

		
//		final은 도중에 값을 바꿀수 없음
		
//		person.nation = "usa";
//		person.ssn = "789456-1234567";
		person.name = "고소영";
		
		
	}

}
