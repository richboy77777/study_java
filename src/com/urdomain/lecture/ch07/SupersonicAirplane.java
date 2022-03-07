package com.urdomain.lecture.ch07;

public class SupersonicAirplane extends Airplane {

//	public static final int NORMAL = 1;
//	public static final int SUPERSONIC = 2;
//	
//	public int flymode = NORMAL;
//
//	@Override
//	public void fly() {
//		if(flymode == SUPERSONIC) {
//			System.out.println("초음속비행합니다.");
//		} else	{
//			super.fly();
//		}
//	}
	
	
//	상수파일 생성 후 코드
	public int flymode = Constants.NORMAL;
	
	@Override
	public void fly() {
		if(flymode == Constants.SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else	{
			super.fly();
		}
	}

	
	
}
