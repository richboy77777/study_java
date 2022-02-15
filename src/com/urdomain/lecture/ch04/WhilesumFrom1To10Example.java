package com.urdomain.lecture.ch04;

public class WhilesumFrom1To10Example {

	public static void main(String[] args) {
		
		
	    int sum = 0;
        int i = 1;
        
        while (i<11) {
            sum += i;
            System.out.println(sum + "," + i);
            i++;
            
        }
            System.out.println("1부터" + (i-1) + "까지의 합: " + sum);
	
		
	}

}
