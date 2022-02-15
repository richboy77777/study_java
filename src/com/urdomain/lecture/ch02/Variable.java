package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
	
		//변수 명명범
		//첫글자 소문자 그리고 다음 문자열 부터는 대문자
		//모든 변수명은 붙여서 사용
		String fullName = "Sangwon Lee"; //카멜표기법  // 변수, 함수
		String full_name = "Sangwon";	//스네이크법		
		String FullName = "Sangwon";	//파스칼 // 클래스, 상수		
		
		
		//대소문자 구분함
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber: " + roomNumber);
		System.out.println("roomnumber: " + roomnumber);
		
		//예약어는 사용할 수 없다
		//int int = 2; //error
		
//		------------------------------------------------------
		
		//변수 1.선언과 2.사용(2.1대입 2.2읽기)
		//변수 선언
		//변수 초기화(선언 후 처음으로 값 저장)
		int a; //선언 : 선언만 하면 사용 불가능
		a = 1; //대입
		
		int b = 1; //선언과 초기화
		
		int c = 0;
				
		c = a + b;
		
		//변수 초기화 하여야 메모리에 생성되고 연산 이용 될수 있다.
		
//		----------------------------------------------
		
		
		//그래서 변수 선언시 초기화 하는 습관을 들이자
		
//		정수형은 0
//		실수형은 0.0
//		문자형은 '' 또는 ""
		
		boolean defaultNy = true; //true
		boolean delNy = false; //true
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 00;
		
		float ee = 0.0f; //f 안쓰면 double로 인식함
		double ff = 0.0;
		
		char gg = ' '; //중간에 공백 넣어줘야함
		
		String hh = "";
		
//		-----------------------------------------------
		
		//변수 사용(변수값 저장 & 변수값 읽음)
		
		//리터럴 = 데이터이다
//		ex)정수형리터럴 = 정수형데이터
		
		
		//이스케이프 문자
		System.out.println(c);
		System.out.println("Sangwon Lee");
		System.out.println("Sangwon Lee: " + c + " so hot");
		
		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		
		System.out.println("\t한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		
		System.out.println("한줄바꿈1");
		System.out.println("\n한줄바꿈");

		System.out.println("한출바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("\'나는생각한다\'");
		System.out.println("소크라테스가 말했다\"나는 존재한다\"");
		System.out.println("\\");
		
		
		//변수의 범위
		//변수는 선언된 블럭 내에서만 사용 가능하다.
		
		if(a==1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " + bbb);
		} else {
			
		}
		
//		System.out.println("bbb: " + bbb);  //error 블럭밖에서는 작동안됨
		
		
		
		
		
		
	}

}
