package com.urdomain.lecture.ch04;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 89;
		
		if(score > 90) {
			System.out.println("정수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

//		블럭을 구성하지 안으면 바로 다음줄까지만 블럭내의 문장으로 이해하고 실행 시킨다.
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다.");
		
		System.out.println("등급은 B입니다.");
//		위에 등급 B는 if문에 포함되어 있지 않아서 그냥 출력되는거임
		
	}

}
