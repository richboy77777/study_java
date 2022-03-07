package com.urdomain.lecture.cote;

import java.util.Scanner;

public class Codingtest0226 {

	public static void main(String[] args) {
		
		//5단계 8958
		
		Scanner scan = new Scanner(System.in);
		 
		String arr[] = new String[scan.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;	
			int sum = 0;	
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					count++;
				} 
				else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
		
		//6단게 4673
		
		

	}

}

//6단계 15996
//class Test {
//    long sum(int[] a) {
//		long sum = 0;	
//        
//		for(int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//	}
//}
