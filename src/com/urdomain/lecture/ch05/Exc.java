package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
//		2부터 9까지 정수형 배열 변ㅅ누 2개를 만들고
//		for 문을 사용하여 구구단 출력을 하시오.

		int[] arr1 = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int a = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				a = arr1[i] * arr2[j];
				System.out.println(arr1[i] + " * " + arr2[j] + " = " + a);
				//System.out.println(arr1[i] + " * " + arr2[j] + " = " + (arr1[i]*arr2[j]));
				
			}
			System.out.println();
		}

	}

}
