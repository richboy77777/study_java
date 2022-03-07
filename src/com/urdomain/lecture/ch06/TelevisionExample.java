package com.urdomain.lecture.ch06;

public class TelevisionExample {

	public static void main(String[] args) {
		
		System.out.println("Television.company" + Television.company);
		System.out.println("Television.model" + Television.model);
		System.out.println("Television.info" + Television.info);
//		System.out.println(Television.version + Television.version);		//error
		System.out.println();

		
		
		//static 작성했는데 굳이 밑에 퀴리문 쓸 이유가 없음
		Television television = new Television();
		
		System.out.println("Television.company" + Television.company);
		System.out.println("Television.model" + Television.model);
		System.out.println("Television.info" + Television.info);
		
	}

}
