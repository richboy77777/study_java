package com.urdomain.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {97, 71, 84, 93, 87, 88, 55};
		
		int a = 0;
		for(int score : scores)	{
			System.out.println(a + "score: " + score);
//			System.out.println(a + "score: " + scores);		//주소값 나옴
//			System.out.println(a + "score: " + scores[a]);	//score 값과 동일함 직접 출력해보기
			a++;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
	}

}
