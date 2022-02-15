package com.urdomain.lecture.ch04;

public class IfElseExample {

	public static void main(String[] args) {
		
	int score = 59;
	
	if(score >= 90) {
		System.out.println("점수가 100~90 사이입니다");
		System.out.println("등급은 A 입니다");
	
	} else if (score >= 80) {
		System.out.println("점수가 80~89 사이입니다");
		System.out.println("등급은 B 입니다");
	
		
	} else if (score >= 70) {
		System.out.println("점수가 70~79 사이입니다");
		System.out.println("등급은 C 입니다");
	
		
	} else if (score >= 60) {
		System.out.println("점수가 60~69 사이입니다");
		System.out.println("등급은 D 입니다");
	
		
	} else {
		System.out.println("점수가 60미만 입니다");
		System.out.println("등급은 F 입니다");
		System.out.println("포기하면 편합니다");
	
	}

//	백준코딩테스트 문제
	
	int a = 20;
	int b = 20;
	
	if (a > b) {
		System.out.println(">");
	} else if (a < b) {
		System.out.println("<");
	} else {
		System.out.println("==");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
