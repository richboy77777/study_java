package com.urdomain.lecture.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
//		초기화식
//		조건식
//		증강식
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
////		------------------------------
//		
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//		sum += i;	
////		sum = sum + i;	
//		}
//		System.out.println(sum);
		
//		------------------------------
	
		
		for (int i=2; i<10; i++) {
			
			for (int j=1; j<10; j++) {
				System.out.println(i +"x" + j + "=" + i*j);
			}
		}
	
	}

}
