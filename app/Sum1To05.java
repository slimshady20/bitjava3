package com.jse.app;

public class Sum1To05 {
	public static void main(String[] args) {
		sum();				//method �⺻���
	}
	
	static void sum() {     // method �⺻���
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
	//		int sum = 0;
			sum += i;		
		}
		System.out.println(String.format("%d", sum));
	}
}