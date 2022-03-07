package com.urdomain.lecture.ch06;

public class FourthCar {
	// field
	int gas;	//5 4 3 2 1 0

	// 생성자

	// 메소드
	void setGas(int gas) {
		this.gas = gas;		//this.gas는 5번째줄 gas 오른쪽 gas는 10번째줄 gas
	}

	boolean isLeftGas() {	//true
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {	//5 4 3 2 1
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {		//4 3 2 1
				System.out.println("없습니다.(gas잔량:" + gas + ")");
			}
		}
	}

}
