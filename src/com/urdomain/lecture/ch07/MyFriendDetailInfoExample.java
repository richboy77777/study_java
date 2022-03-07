package com.urdomain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
//	자식 프로그램 클래스
		
		//MyFriendDetailInfo 객체 생성 : 자식
		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo("이순신", 100, "성균관", "010-0000-8888");

		//MyFriendInfo로부터 상속 받은 필드
		System.out.println("이름: " + myFriendDetailInfo.name);
		System.out.println("나이: " + myFriendDetailInfo.age);
				
		//MyFriendDetailInfo의 필드
		System.out.println("주소: " + myFriendDetailInfo.address);
		System.out.println("번호: " + myFriendDetailInfo.num);
		
		
	}

}
