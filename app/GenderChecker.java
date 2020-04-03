package com.jse.app;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		find();

	}
	static void find() {
		System.out.println("주민번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		 String IdNum= scanner.next();
		 System.out.println(IdNum);
		char gender= IdNum.charAt(7);
		switch(gender) {
			case '1': case '3': System.out.println("남성입니다."); break;
			case '2': case '4': System.out.println("여성입니다."); break;
			case '5': case '6': System.out.println("외국인입니다."); break; 
			case '0': case '7': 
			case '8': case '9': System.out.println("잘못 입력하였습니다."); break;
		}
	
	
		
		//String ssn= "910101-123456";
		
		//char ch = ssn.charAt(7); // 0부터 세서
		
		// String a = "";
		// char c= '';
		// case '1'
		// 	System.out.println("남성");  // 1, 3
		// 	System.out.println("여성");  // 2,4
		// 	System.out.println("외국인"); // 5,6
		// 	System.out.println("잘못 입력된 값"); // 0,7,8,9
	}
}

/*
		System.out.println("주민번호를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		 String ssn= scanner.next();
		System.out.println(ssn);
		char ch= ssn.charAt(7);
		String result ="";
		switch(ch) {
			case '1': case '3': result ="남성"; break;
			case '2': case '4': result ="여성"; break;
			case '5': case '6': result ="외국인"; break; 
			default: result= "외국인"; break;	
			}
			System.out.println(result);
			}	
*/
