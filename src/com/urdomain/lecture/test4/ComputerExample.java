package com.urdomain.lecture.test4;

import com.urdomain.lecture.test4.Calculator;
import com.urdomain.lecture.test4.Computer;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 7;

		Calculator calculator = new Calculator();

		System.out.println("원의 반지름: " + r);
		System.out.println();

		System.out.println("원면적: " + calculator.Circle(7));
		System.out.println();

		Computer computer = new Computer();

		System.out.println("원면적: " + computer.Circle(7));

	}

}
