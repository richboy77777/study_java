package com.urdomain.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String ("장원영");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1= " +result1);
		
		boolean result2 = (str1 == str3);
		System.out.println("result2= " +result2);
		
		
		//위의 == result1 비교는 장원영이라는 메모리 저장위치는 1개고 그걸 str1 str2 두개에 나눠준다 그래서 트루
		//result2 는 str3가 새로 선언하면서 초기화되서 메모리 저장 위치가 다르다 그래서 폴스
		
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));	//== (x)
		System.out.println("str1.equals(str3): " + str1.equals(str3));	//== (x)
		
		//str 에 선언된 변수값 장원영 이라면 문자열이 동일 하므로 둘다 트루
		
		
	}

}
