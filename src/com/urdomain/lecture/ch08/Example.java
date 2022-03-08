package com.urdomain.lecture.ch08;

public class Example {

	public static void main(String[] args) {
		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
//		interfaceA.methodB();	//error 본인 인터페이스 메소드만 사용가능
		interfaceB.methodB();
		interfaceC.methodC();

	}

}
