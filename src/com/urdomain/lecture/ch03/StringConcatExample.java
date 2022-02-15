package com.urdomain.lecture.ch03;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK" + 1.8;
		String str2 = str1 + "입니다.";
		
		System.out.println("str2: " + str2);
		
		String strA = "이상원 ";
		String strB = " 010-0000-0000 ";
		String strC = strA + strB + "입니다.";
		
		//이름 : 전화번호
		//
		
		System.out.println("strC: " + strC);
		
	}

}
