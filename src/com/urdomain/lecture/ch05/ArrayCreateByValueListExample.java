package com.urdomain.lecture.ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		int[] score;
		
		int score2[];
		
		int[] score3 = {1,2,3,4,5,6,7,8,9,10};
		
		int score4[] = {4,5,6};
		
		double[] score6 = {1,2,3,4};
		
		String[] strArray = {"이상원", "정우성", "장동건", "고소영"};
		
//		입력이 되는 데이터 타입이 동일해야 된다.
//		순서는 무조건 0부터 시작한다. 0은 index라고 부름
//		총갯수를 원활하게 늘릴 수 없다
		
		int[] score7 = {83, 90, 87, 99};
		
		System.out.println("score[0]: " + score7[0]);
		System.out.println("score[1]: " + score7[1]);
		System.out.println("score[2]: " + score7[2]);
		System.out.println("score[3]: " + score7[3]);
		
		
		int sum = 0;
		
		for(int i=0; i<4; i++)	{          // i=1 아님 배열의 경우 0부터 시작하므로 int i=0임 i<4는 0, 1, 2, 3 0부터 시작하고  4개이므로 i<4
			sum += score7[i];
		}
		
		System.out.println("총합은 : " + sum);
		double avg = (double) sum / 4;
//		double avg = sum / 4.0;
		System.out.println("평균은 : " + avg);
		
	}

}
