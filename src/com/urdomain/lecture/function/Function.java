package com.urdomain.lecture.function;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		
//		함수의 사용
		int sum = add(3, 4);
		System.out.println(sum);
		int minus = add2(3, 4);
		System.out.println(minus);
		int multiply = add3(3, 4);
		System.out.println(multiply);	
		int Remainder = add4(3, 4);
		System.out.println(Remainder);
		int share = add5(3, 4);
		System.out.println(share);
		
		for(int a : allInOne(6, 3)) {
			System.out.println(a);
		}
		
		System.out.println(bbb("이상원", "치킨"));
		
		
	}
	
		
	
//		함수의 선언
//		void를 쓸 경우 선언만 가능함 return 출력값은 쓸 수 없음
	
		public static int add(int a, int b)	{
			int sum = a + b;
			return sum;
		}
		public static int add2(int a, int b)	{
			int minus = a - b;
			return minus;
		}
		public static int add3(int a, int b)	{
			int multiply = a * b;
			return multiply;
		}
		public static int add4(int a, int b)	{
			int Remainder = a % b;
			return Remainder;
		}
		public static int add5(int a, int b)	{
			int share = a / b;
			return share;
		}
		
		
//		- * % / 대한 함수를 선언 후 사용하는 프로그래밍을 완성하시오
		public static int[] allInOne(int a, int b) {
			int sum = 0;
			int[] sum2 = new int[5];
				sum2[0] = a + b;
				sum2[1] = a-b;
				sum2[2] = a*b;
				sum2[3] = a/b;
				sum2[4] = a%b;
			
			return sum2;
		}


		
		public int aaa	(int a, int b, int c, String d, boolean e) {
			System.out.println(a);
			return 1;
		}
		
//		덧셈함수
//		input : int, int
//		output : int
		
		public static int addd(int a, int b)	{
			return 1;
		}
		
//		두 문자열을 합치는 함수
//		input : String, String
//		output : String
		
		public static String bbb(String a, String b)	{
			String ccc = a + b;
			return ccc;
		}
		
		
}
