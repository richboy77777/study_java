package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
//		int[] score = {83, 90, 87, 99};  데이터 값이 정해져 있는 경우

		int[] arr1 = new int[3];	//배열의 갯수가 정해져 있는 경우
		
		for(int i=0; i<3; i++)	{
			System.out.println("arr1[" + "]: " + arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<3; i++)	{
			System.out.println("arr1[" + "]: " + arr1[i]);
		}
	
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		
		for(int i=0; i<3; i++)	{
			System.out.println("arr1[" + "]: " + arr1[i]);
		}
//		중복해서 계속 주입가능
//		-----------------------------------------------------------
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++)	{
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		arr2[0] = 1.0;
		arr2[1] = 2.0;
		arr2[2] = 3.0;
	
		for(int i=0; i<3; i++)	{
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
	
//		------------------------------------------------------------
		
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++)	{
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
	
		arr3[0] = "이상원";
		arr3[1] = "정우성";
		arr3[2] = "고수";
	
		for(int i=0; i<3; i++)	{
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
	
	
	}

}
