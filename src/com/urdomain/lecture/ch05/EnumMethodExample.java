package com.urdomain.lecture.ch05;

import java.util.Calendar;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		System.out.println(today);		//데이터 타입이 Week
		
		String name = today.name();		//name은 매우 자주 쓰임 중요함 데이터 타입 변경하기
		System.out.println(name);		//데이터 타입이 String
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);		//아래로 가면  마이너스
		int result2 = day2.compareTo(day1);		//위로 가면 플러스
		System.out.println(result1);
		System.out.println(result2);

		//valueOf() 메소드
		/*Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}*/
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
