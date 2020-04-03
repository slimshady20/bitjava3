package com.jse.app;
import java.util.Scanner;
public class HelloJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름이 뭐에요?");
		String name = scanner.next();
	//	클래스(대문자) 변수 변수 메소드	
		System.out.println("안녕하세요 " + name+ "씨.");
	//	클래스      변수       메소드		상수
		
	/*	System.out.println("어디 사세요?");
		String name2 = scanner.next();
		System.out.println("아 " + name2 + " 좋은곳이에요");
		int double String은 타입/ height,weigh,age는 변수
	*/	
		int age = scanner.nextInt();
		System.out.println(age+ "살이네요.");
		System.out.println("키는 몇이고 , 몸무게는 몇  k입니까?");
		double height= scanner.nextFloat();
		double weight= scanner.nextDouble();
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.nextAt(0);
	
		int a;  // 변수 a를 선언하다.
		System.out.println(a);
	
	}	
}
