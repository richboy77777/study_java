package com.urdomain.lecture.ch04;

public class SwitchStringExample {

	public static void main(String[] args) {
		
		String position = "과장";
		
		switch (position) {
			case "사원":
				System.out.println("월급300만원");
				break;
			case "대리":
				System.out.println("월급400만원");
				break;
			case "과장":
				System.out.println("월급500만원");
				break;
			case "부장":
				System.out.println("월급600만원");
				break;
			default:
				System.out.println("기본급적용");
				break;
		}
	}

}
