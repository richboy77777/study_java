package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				if (i*j % 2 == 0) {
					a += i*j;
				} else {
					b += i*j;
				}
				
				
				System.out.println(i + "x" + j +"=" + i*j);
			}
				
				System.out.println("짝수의 합계: " + a);
				System.out.println("홀수의 합계: " + b);
				System.out.println("둘의 합계: " + (a+b));
		}

	}

}
