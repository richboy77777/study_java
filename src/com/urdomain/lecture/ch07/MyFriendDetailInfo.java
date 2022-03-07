package com.urdomain.lecture.ch07;

public class MyFriendDetailInfo extends MyFriendInfo {
//자식
	
	//필드
	String address;
	String num;
	
	//생성자(명시적 생성자)
	MyFriendDetailInfo(String name, int age, String address, String num)	{
		this.name = name;
		this.age = age;
		this.address = address;
		this.num = num;
	}
	
	
}
