package com.jse.app;

public class Sum1To05 {
	public static void main(String[] args) {
		sum();				//method 기본모양
	}
	
	static void sum() {     // method 기본모양
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
	//		int sum = 0;
			sum += i;		
		}
		System.out.println(String.format("%d", sum));
	}
}