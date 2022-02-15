package com.urdomain.lecture.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = new int[5];

		for(int i=0; i<arr2.length; i++)	{
			System.out.println(arr2[i]);
		}

		System.out.println();
		
//		System.arraycopy(arr1, 0, arr2, 0, arr1.length);	//12300
//		System.arraycopy(arr1, 0, arr2, 1, arr1.length);	//01230
//		System.arraycopy(arr1, 0, arr2, 2, arr1.length);	//00123
//		System.arraycopy(arr1, 0, arr2, 3, arr1.length);    //오류뜸 
		System.arraycopy(arr1, 0, arr2, 1, arr1.length-1);  //01200
		
		
		for(int i=0; i<arr2.length; i++)	{
			System.out.println(arr2[i]);
		}
	}

}
