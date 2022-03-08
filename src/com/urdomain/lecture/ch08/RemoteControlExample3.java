package com.urdomain.lecture.ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		RemoteControl remoteControl = new SmartTelevision();
		Searchable searchable = new SmartTelevision();
		
		remoteControl.turnOn();
		remoteControl.turnOn();
//		remoteControl.search("safasdfsad");		//error
	
//		searchable.turnOff();		//error
//		searchable.turnOn();		//error
		searchable.search("소갈비 마렵네");
	
	
	}

}
