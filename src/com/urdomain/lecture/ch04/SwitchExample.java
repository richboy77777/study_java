package com.urdomain.lecture.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
//		int num = 5;
		
//		Math.random() : 0.0~1.0에 가까운 double 형 값 보내줌
//		int num = Math.random() * (max - min + 1) + min;
//		
//		double num = Math.random();
//		System.out.println(num);
		
		int num1 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int  a = num1 + num2;
		
		
		switch (num1) {
			case 1:
				System.out.println("첫번째 주사위는 1번 입니다.");
				break;
			case 2:
				System.out.println("첫번째 주사위는 2번 입니다.");
				break;
			case 3:
				System.out.println("첫번째 주사위는 3번 입니다.");
				break;
			case 4:
				System.out.println("첫번째 주사위는 4번 입니다.");
				break;
			case 5:
				System.out.println("첫번째 주사위는 5번 입니다.");
				break;
			default:
				System.out.println("첫번째 주사위는 6번 입니다.");
				break;
		}	
		
		switch (num2) {
		case 1:
			System.out.println("두번째 주사위는 1번 입니다.");
			break;
		case 2:
			System.out.println("두번째 주사위는 2번 입니다.");
			break;
		case 3:
			System.out.println("두번째 주사위는 3번 입니다.");
			break;
		case 4:
			System.out.println("두번째 주사위는 4번 입니다.");
			break;
		case 5:
			System.out.println("두번째 주사위는 5번 입니다.");
			break;
		default:
			System.out.println("두번째 주사위는 6번 입니다.");
			break;
				
	}	
			System.out.println("두수의 합은" + a + "입니다.");	
	}

}
